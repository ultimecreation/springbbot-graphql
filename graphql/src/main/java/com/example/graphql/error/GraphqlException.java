package com.example.graphql.error;

import java.util.HashMap;

import org.springframework.graphql.execution.ErrorType;

public class GraphqlException extends RuntimeException {

    private ErrorType errorType;
    private HashMap<String, Object> extendedErrors;

    public GraphqlException(String message, ErrorType errorType, HashMap<String, Object> extendedErrors) {
        super(message);
        this.errorType = errorType;
        this.extendedErrors = extendedErrors;
    }

    public ErrorType getErrorType() {
        return this.errorType;
    }

    public HashMap<String, Object> getExtendedErrors() {
        return this.extendedErrors;
    }

}
