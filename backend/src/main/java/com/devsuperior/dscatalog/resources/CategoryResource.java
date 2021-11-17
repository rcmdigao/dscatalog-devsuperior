package com.devsuperior.dscatalog.resources;

import com.devsuperior.dscatalog.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @GetMapping(value = "categorias")
    public ResponseEntity<List<Category>> findall() {
        List<Category> list = new ArrayList<>();
        list.add(new Category(1L, "Livros"));
        list.add(new Category(2L, "Eletronicos"));
        list.add(new Category(3L, "Casa"));

        return ResponseEntity.ok().body(list);
    }


}
