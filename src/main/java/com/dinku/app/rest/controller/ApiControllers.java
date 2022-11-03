package com.dinku.app.rest.controller;


import com.dinku.app.rest.Models.User;
import com.dinku.app.rest.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {

  @Autowired
  private UserRepo userRepo; // called from repo package and UserRepo class


  @GetMapping(value = "/users") // get all users
  public List<User> getUsers() {
    return userRepo.findAll();
  }

   @PostMapping(value = "/save") // add new user
   public String saveUser(@RequestBody User user) {
    userRepo.save(user);
    return "Saved!";

    // awesome practice this will allow me to save data to the database from postman
    }
    @PutMapping (value = "/update/{id}") // this will allow me to update data from postman
    public String updateUser(@PathVariable long id, @RequestBody User user) {
    User updateUser = userRepo.findById(id).get();
    updateUser.setFirstName(user.getFirstName());
    updateUser.setLastName(user.getLastName());
    updateUser.setEmail(user.getEmail());
    updateUser.setProfession(user.getProfession());
    updateUser.setAge(user.getAge());
    updateUser.setAddress(user.getAddress());
    userRepo.save(updateUser);
    return "Updated!";
    }

  @DeleteMapping(value = "/delete/{id}") // this will allow me to delete data from postman
  public String deleteUser(@PathVariable long id) {
    User deleteUser = userRepo.findById(id).get();
    userRepo.delete(deleteUser);
    return "Deleted!"+id;
  }
}


