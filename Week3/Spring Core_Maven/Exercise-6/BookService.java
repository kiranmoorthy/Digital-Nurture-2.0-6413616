package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void addBook(String title){
        System.out.println("BookService: Adding book -- "+title);
        bookRepository.setBooks(title);
    }

    public void displayBooks(){
        List<String> books= bookRepository.getBooks();
        System.out.println("BookService: Displaying all books: ");
        for(String book:books){
            System.out.println(" -- "+book);
        }
    }
}
