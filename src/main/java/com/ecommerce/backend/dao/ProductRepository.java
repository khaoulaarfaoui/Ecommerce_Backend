package com.ecommerce.backend.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ecommerce.backend.entity.Product;

@CrossOrigin(origins = "http://localhost:4200")

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long>{
	@RestResource(path="/products")

	public List<Product> findAll();
	@RestResource(path="/ByTitle")

	public List<Product> findByTitleContains(@Param("title") String title);
	@RestResource(path="/ByTitlePage")

	public Page<Product> findByTitleContains(@Param("title") String title, Pageable pageable);
}
