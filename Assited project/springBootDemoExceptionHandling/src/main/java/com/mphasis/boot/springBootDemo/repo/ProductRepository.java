package com.mphasis.boot.springBootDemo.repo;

import org.springframework.data.repository.CrudRepository;

import com.mphasis.boot.springBootDemo.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>  {

}
