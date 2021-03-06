package com.shaanxd.cardapp.controllers;

import com.shaanxd.cardapp.entities.User;
import com.shaanxd.cardapp.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ApplicationController {
    private ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @ResponseBody
    @PostMapping("/")
    private ResponseEntity<?> postUser(@Valid @RequestBody User user,BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // Errors
            return null;
        }
        User postingUser = applicationService.postUser(user);
        return ResponseEntity.ok(postingUser.getId());
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> getUser(@PathVariable String id) {
        User user = applicationService.getUser(id);
        return ResponseEntity.ok(user);
    }
}
