package com.abc.JasperReport.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(exclude = {"products"})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;

	@Column(nullable = false, length = 60)
	private String name;

	@Column(length = 200)
	private String description;

	private String imageUrl;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = false)
//	@JsonManagedReference
	@JsonIgnoreProperties("category")
	private List<Product> products;

}
