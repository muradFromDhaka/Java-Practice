package com.abc.StudentToDoApp.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.abc.StudentToDoApp.enums.Status;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="studentsProject")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Project {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long projectId;
	    
	    @Column(nullable = false, length= 200)
        private String projectTitle;
	    
	    @Column(length= 200)
        private String description;
	    
	    
        private LocalDate submissionDate;
        
        @ElementCollection
        @CollectionTable(name="assignment-table" , joinColumns = @JoinColumn(name="project-id"))
        @Column(name="project-document")
        private List<String> documents;
        
        @Enumerated(EnumType.STRING)
        private Status status;
        
        
        @CreationTimestamp
        private LocalDateTime createdAt;
        
        @UpdateTimestamp
        private LocalDateTime updatedAt;
        
}
