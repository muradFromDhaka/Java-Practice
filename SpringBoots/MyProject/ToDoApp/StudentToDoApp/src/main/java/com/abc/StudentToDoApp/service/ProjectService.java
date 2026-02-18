package com.abc.StudentToDoApp.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.abc.StudentToDoApp.entity.Project;
import com.abc.StudentToDoApp.repository.ProjectRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;
    private final ProjectFileStorageService fileStorageService;


    public List<Project> getAll() {
        return projectRepository.findAll();
    }


    public Optional<Project> getById(Long id) {
        return projectRepository.findById(id);
    }


    public Project save(Project project, MultipartFile[] files) throws IOException {

        List<String> urls = new ArrayList<>();
        
        
        if(files != null && files.length > 0) {
        	for (MultipartFile file : files) {
        		if(!file.isEmpty()) {
        			urls.add(fileStorageService.saveFile(file));
        		}
              
          }
        }    

        project.setDocuments(urls);

        return projectRepository.save(project);
    }

 // Update method
    public Project update(Long id, Project updateProject, MultipartFile[] files) throws IOException {

        Project existing = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(id + " id not found"));

        existing.setProjectTitle(updateProject.getProjectTitle());
        existing.setDescription(updateProject.getDescription());
        existing.setStatus(updateProject.getStatus());
        existing.setSubmissionDate(updateProject.getSubmissionDate());

        // Prevent NULL documents list
        List<String> finalDocumentUrls = updateProject.getDocuments() != null
                ? updateProject.getDocuments()
                : new ArrayList<>();

        // Add uploaded files
        if (files != null && files.length > 0) {
            for (MultipartFile file : files) {
                if (!file.isEmpty()) {
                    finalDocumentUrls.add(fileStorageService.saveFile(file));
                }
            }
        }

        existing.setDocuments(finalDocumentUrls);

        return projectRepository.save(existing);
    }
    

    //delete a Single document 
    public String deleteDucoment(Long id, String documentUrl) throws IOException {

        Project project = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("The Project isn't found"));

        if (project.getDocuments() == null || !project.getDocuments().remove(documentUrl)) {

            return "The document isn't found";
        }

        fileStorageService.deleteFile(documentUrl);
        projectRepository.save(project);

        return "Document deleted successfully.";
    }


    // Delete entire project
    public String deleteProject(Long id) throws IOException {

        Project project = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("The project isn't found."));

        if (project.getDocuments() != null) {
            for (String urls : project.getDocuments()) {
                fileStorageService.deleteFile(urls);
            }
        }

        projectRepository.delete(project);

        return "The Project deleted successfully.";
    }
}
