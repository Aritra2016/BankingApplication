package org.aritra.accounts.Exception;

import org.aritra.accounts.DTO.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    /*
    1) WebRequest = by using this Inside our errorResponseDto we decide to send API path that my client application want to invoke

     */

    @ExceptionHandler(CustomerAlreadyExistsException.class)   //It will tell for which method this exception is managed
    public ResponseEntity<ErrorResponseDto > handleGlobalException(Exception exception,
                                                                   WebRequest webRequest){
        ErrorResponseDto errorResponseDTO = new ErrorResponseDto(
                webRequest.getDescription(false),    //getting api path information
                HttpStatus.INTERNAL_SERVER_ERROR,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
