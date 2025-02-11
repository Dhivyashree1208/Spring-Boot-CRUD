package com.example.srec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

@Service
public class UseService {
    @Autowired UseRepo repo;
    public UseEntity saveUser(UseEntity human){
        return repo.save(human);
    }
    public List<UseEntity> getAll(){
        return repo.findAll();
    }
    public UseEntity updateUser(int id, UseEntity newUser){
        Optional<UseEntity> existingUser=repo.findById(id);
        if(existingUser.isPresent()) {
            UseEntity human = existingUser.get();
            human.setName(newUser.getName());
            human.setAge(newUser.getAge());
            human.setAmount(newUser.getAmount());
            return repo.save(human);
        }
        return null;

        }
        public String deleteUser(int id) {
            if (repo.existsById(id)) {
                repo.deleteById(id);
                return "User deleted successfully!";

            }
            return "User not found!";

        }
    }
