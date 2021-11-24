package com.maria.controller;

import com.maria.model.Cat;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cats")
public class CatController {

//    public static List<Cat> cats = new ArrayList<>();
//    static {
//        cats.add(new Cat(1, "Murka", 1, true, "", "british"));
//        cats.add(new Cat(2, "Boris", 2, true, "", "scotish"));
//        cats.add(new Cat(3, "Lina", 3, true, "", "sphynx"));
//    }
//
//    @GetMapping("")
//    public List<Cat> getAll(){
//        return cats;
//    }
//
//    @GetMapping("/{id}")
//    public Cat getCat(@PathVariable("id")Integer id){
//        return cats.stream().filter(cat -> cat.getId().equals(id)).findAny().get();
//    }
//
//    @PostMapping("")
//    public Cat addCat(@RequestBody Cat cat){
//        cats.add(cat);
//        return cat;
//    }

}
