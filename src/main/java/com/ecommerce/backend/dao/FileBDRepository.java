package com.ecommerce.backend.dao;

import com.ecommerce.backend.entity.*;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


public interface FileBDRepository  extends JpaRepository<FileDB, Long>{
	 Optional<FileDB> findByName(String name);	 
	 Optional<FileDB> findById(Long id);	 

}
