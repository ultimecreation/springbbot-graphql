package com.example.graphql.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.stereotype.Controller;

import com.example.graphql.entity.Book;
import com.example.graphql.error.GraphqlException;
import com.example.graphql.repository.BookRepository;

@Controller
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @QueryMapping
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @QueryMapping
    public Book getBookById(@Argument int id) {
        var test = new HashMap<String, Object>();
        var errors = new HashMap<>();
        errors.put("error1", "test for error 1");
        test.put("errors", errors);

        return bookRepository.findById(id)
                .orElseThrow(() -> new GraphqlException("Book not found",
                        ErrorType.BAD_REQUEST, test));
    }

    // @GraphQlExceptionHandler
    // public GraphQLError handle(RuntimeException ex, HashMap<String, Object>
    // errors) {
    // // var test = new HashMap<String, Object>();
    // // var errors = new HashMap<>();
    // // errors.put("error1", "test for error 1");
    // // test.put("errors", errors);
    // return GraphQLError
    // .newError()
    // .errorType(ErrorType.BAD_REQUEST)
    // .message(ex.getMessage())
    // .extensions(errors)
    // .build();
    // }
}
