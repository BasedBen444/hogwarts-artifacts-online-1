package edu.tcu.cs.hogwartsartifactonline1.system.exception;

import edu.tcu.cs.hogwartsartifactonline1.artifact.Artifact;
import edu.tcu.cs.hogwartsartifactonline1.artifact.ArtifactNotFoundException;
import edu.tcu.cs.hogwartsartifactonline1.system.Result;
import edu.tcu.cs.hogwartsartifactonline1.system.StatusCode;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class ExceptionHandlerAdvice {
    @ExceptionHandler(ArtifactNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    Result handleArtifactNotFoundException(ArtifactNotFoundException ex) {
        return new Result(false, StatusCode.NOT_FOUND, ex.getMessage());
    }
}
