package com.abc.StudentToDoApp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.abc.StudentToDoApp.entity.Project;
import com.abc.StudentToDoApp.service.ProjectFileStorageService;
import com.abc.StudentToDoApp.service.ProjectService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/projects")
@CrossOrigin(origins = "*")
public class ProjectController {

    private final ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<Project>> getAllProjects() {
        return ResponseEntity.ok(projectService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable Long id) {
        return projectService.getById(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new RuntimeException("Project not found with id " + id));
    }

    @PostMapping("/save")
    public ResponseEntity<Project> saveProject(
            @RequestPart("project") Project project,
            @RequestPart(value = "files", required = false) MultipartFile[] files) throws IOException {

        return ResponseEntity.ok(projectService.save(project, files));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Project> updateProject(
            @PathVariable Long id,
            @RequestPart("project") Project updateProject,
            @RequestPart(value = "files", required = false) MultipartFile[] files) throws IOException {

        return ResponseEntity.ok(projectService.update(id, updateProject, files));
    }

    @DeleteMapping("/{id}/documents")
    public ResponseEntity<?> deleteDocument(
            @PathVariable Long id,
            @RequestParam String fileName) throws IOException {

        return ResponseEntity.ok(projectService.deleteDucoment(id, fileName));
    }

    @DeleteMapping("project/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable Long id) throws IOException {
        return ResponseEntity.ok(projectService.deleteProject(id));
    }
}

