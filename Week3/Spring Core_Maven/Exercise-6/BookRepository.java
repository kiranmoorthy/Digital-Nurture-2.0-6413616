package com.library.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    private List<String> books = new ArrayList<>();

    public void setBooks(String title){
        books.add(title);
        System.out.println("BookRepository: Saved book -- "+ title);
    }

    public List<String> getBooks(){
        return books;
    }

}
