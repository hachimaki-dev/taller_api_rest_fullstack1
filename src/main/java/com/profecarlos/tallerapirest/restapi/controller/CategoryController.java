package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.profecarlos.tallerapirest.restapi.model.Category;
import com.profecarlos.tallerapirest.restapi.repository.CategoryRepository;

@RestController
@RequestMapping("/api/v1")
public class CategoryController {
    
    @Autowired
    private CategoryRepository categoryRepository;

    //GET: Listar todo
    @GetMapping("category")
    public ResponseEntity<List<Category>> getAllCategories(){
        List<Category> category = categoryRepository.findAll();
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    //GET: Busqueda por id
    @GetMapping("category/{id}")
    public ResponseEntity<?> getCategoryById(@PathVariable int id){
        Category category = categoryRepository.findById(id).orElse(null);
        if (category == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(category,HttpStatus.OK);
        }
    }

    //POST: Creacion de categoria
    @PostMapping("category/post")
    public ResponseEntity<Category>insertCategory(@RequestBody Category category){
        Category savedCategory = categoryRepository.save(category);
        if(savedCategory != null){
            return new ResponseEntity<>(savedCategory,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

    @PutMapping("updCategory/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable("id") int id,@RequestBody Category categoryUpdated){
        
        if (categoryRepository.findById(id)!=null){
            return categoryRepository.findById(id)
            .map(categoryExistent -> {
                categoryExistent.setNombre(categoryUpdated.getNombre());
                categoryExistent.setId(categoryUpdated.getId());
                Category updated = categoryRepository.save(updated);
                return new ResponseEntity<>(updated,HttpStatus.OK);
            });
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
