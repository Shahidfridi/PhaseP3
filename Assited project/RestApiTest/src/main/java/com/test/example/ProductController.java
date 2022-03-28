package com.test.example;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mapping.PersistentEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/webapi") 
public class ProductController {
    
    @Autowired
    ProductService productService;
    
    @RequestMapping("/allproduct")
    public List<PersistentEntity> getAllProduct(){
        return (List<PersistentEntity>) productService.getAllProduct();
    }
    
    @RequestMapping("/product/{id}")
    public PersistentEntity getProduct(@PathVariable int id){
        return productService.getProduct(id);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/product")   
    public void addProduct(@RequestBody PersistentEntity pe ) {
        productService.addProduct(pe);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/product/{id}")
    public void updateProduct(@PathVariable int id, @RequestBody PersistentEntity pe ) {
        productService.updateProduct(id, pe);
    }   

    @RequestMapping(method=RequestMethod.DELETE, value="/product/{id}")
    public void deleteProduct(@PathVariable int id)  {
        productService.deleteProduct(id);
    }
}


