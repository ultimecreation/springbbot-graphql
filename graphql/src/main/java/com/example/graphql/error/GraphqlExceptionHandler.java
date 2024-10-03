package com.example.graphql.error;

import org.springframework.graphql.data.method.annotation.GraphQlExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

import graphql.GraphQLError;

@ControllerAdvice
public class GraphqlExceptionHandler {

    @GraphQlExceptionHandler
    public GraphQLError handleGraphqlException(GraphqlException ex) {
        return GraphQLError.newError()
                .message(ex.getMessage())
                .errorType(ex.getErrorType())
                .extensions(ex.getExtendedErrors())
                .build();
    }
}
