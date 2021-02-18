package com.example.testproject.controllers;

import com.example.api.BooksApi;
import com.example.models.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController implements BooksApi {

    @Override
    public ResponseEntity<Void> createBook(@Valid Book body) {
        System.out.println(body.getName());
        return null;
    }

    @Override
    public ResponseEntity<List<Book>> getAllBooksInLibrary() {
        List<Book> books = new ArrayList<>();
        books.add(new Book());
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
