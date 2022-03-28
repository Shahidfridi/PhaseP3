package com.mphasis.web.springBootWebDemo.repo;

import org.springframework.data.repository.CrudRepository;

import com.mphasis.web.springBootWebDemo.entity.*;

public interface ProductRepository extends CrudRepository<Product, Integer>  {

}
