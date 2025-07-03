package com.library.service;
import com.library.repository.BookRepository;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title){
        System.out.println("BookService: Adding book - " + title);
        bookRepository.setBooks(title);

    }

    public void displayBooks(){
        System.out.println("BookService: Displaying books");
        List<String> books = bookRepository.getBooks();
        for(String book : books){
            System.out.println(" --  " + book);
        }
    }
}
