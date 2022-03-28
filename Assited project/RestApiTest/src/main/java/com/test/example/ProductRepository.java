package com.test.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mapping.PersistentEntity;

public interface ProductRepository extends JpaRepository<PersistentEntity, Integer>{

}
