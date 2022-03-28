
package com.test.example;
import com.example.demo.Entity;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mapping.PersistentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
        
    @Autowired
    CrudRepository productRepository;
    
    public Iterable getAllProduct(){
        return productRepository.findAll();
    }
        
    public PersistentEntity getProduct(int id){
        return (PersistentEntity) productRepository.findById(id).get();
    }
        
    public void addProduct(PersistentEntity pe){
        productRepository.save(pe);
    }
        
    public void updateProduct(int id, PersistentEntity pe){
        if(productRepository.findById(id).isPresent()) {
            PersistentEntity oldProductEntity=(PersistentEntity) productRepository.findById(id).get();
            ((Entity) oldProductEntity).setName(pe.getName());
            ((Entity) oldProductEntity).setDescription(((Entity) pe).getDescription());
            productRepository.save(oldProductEntity);
        }
    }
        
    public void deleteProduct(int id){
        productRepository.deleteById(id);       
    }
}
