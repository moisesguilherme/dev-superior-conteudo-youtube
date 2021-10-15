package com.devsuperior.myfirstproject.repositoreis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.myfirstproject.entities.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
		
}
