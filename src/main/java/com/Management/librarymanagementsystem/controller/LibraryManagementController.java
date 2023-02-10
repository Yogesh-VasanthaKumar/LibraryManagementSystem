package com.Management.librarymanagementsystem.controller;

import com.Management.librarymanagementsystem.model.LibraryModel;
import com.Management.librarymanagementsystem.service.LibraryManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryManagementController {



    public LibraryManagementService libraryManagementService;

    public LibraryManagementController(LibraryManagementService libraryManagementService) {
        this.libraryManagementService = libraryManagementService;
    }

    @GetMapping("/libraries")
    public List<LibraryModel> getAll(){
    return libraryManagementService.getAll();
}

@PostMapping("/libraries/{name}")
    public LibraryModel getByName(String name){
        return libraryManagementService.getByName(name);
}
}
