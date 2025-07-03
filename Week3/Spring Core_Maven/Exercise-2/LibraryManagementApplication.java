package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service = context.getBean("bookService",BookService.class);

        service.addBook("Biography of Adolf Hitler");
        service.addBook("Adventure of King Kong");

        service.displayBooks();
    }
}
