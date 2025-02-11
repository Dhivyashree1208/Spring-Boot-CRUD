package com.example.srec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class UseController {
    @Autowired UseService ser;
    @PostMapping("/add")
    public UseEntity adduser(@RequestBody UseEntity human){
        return ser.saveUser(human);
    }
    @GetMapping("/gets")
    public List<UseEntity> getData() {
        return ser.getAll();
    }
    @PutMapping("/update/{id}")
    public UseEntity updateUser(@PathVariable int id, @RequestBody UseEntity human){
        return ser.updateUser(id, human);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        return ser.deleteUser(id);
    }
}
