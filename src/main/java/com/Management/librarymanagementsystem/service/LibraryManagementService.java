package com.Management.librarymanagementsystem.service;

import com.Management.librarymanagementsystem.model.LibraryModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LibraryManagementService {
    public static List<LibraryModel> library= new ArrayList<>();
    static {
        library.add(new LibraryModel("LibraryName","Banglore",5, Arrays.asList("Silence")));
    }
    public List<LibraryModel> getAll(){
        return library;
    }

    public LibraryModel getByName(String Name){
        for(LibraryModel a: library){
            if(a.getName()==Name){
                return a;
            }
        }
        return null;
    }
}
