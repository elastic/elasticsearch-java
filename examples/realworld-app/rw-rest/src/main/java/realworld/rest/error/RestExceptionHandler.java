/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package realworld.rest.error;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import realworld.document.exception.ResourceAlreadyExistsException;
import realworld.document.exception.ResourceNotFoundException;
import realworld.document.exception.UnauthorizedException;

import java.io.IOException;
import java.util.List;

@ControllerAdvice
public class RestExceptionHandler
    extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value
        = {IOException.class})
    protected ResponseEntity<Object> handleIo(
        RuntimeException ex, WebRequest request) {
        return handleExceptionInternal(ex, new RestError(List.of("Connection Error with the Database")),
            new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    @ExceptionHandler(value
        = {ResourceAlreadyExistsException.class})
    protected ResponseEntity<Object> handleConflict(
        RuntimeException ex, WebRequest request) {
        return handleExceptionInternal(ex, new RestError(List.of(ex.getLocalizedMessage())),
            new HttpHeaders(), HttpStatus.CONFLICT, request);
    }

    @ExceptionHandler(value
        = {ResourceNotFoundException.class})
    protected ResponseEntity<Object> handleNotFound(
        RuntimeException ex, WebRequest request) {
        return handleExceptionInternal(ex, new RestError(List.of(ex.getLocalizedMessage())),
            new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler(value
        = {UnauthorizedException.class})
    protected ResponseEntity<Object> handleUnauthorized(
        RuntimeException ex, WebRequest request) {
        return handleExceptionInternal(ex, new RestError(List.of(ex.getLocalizedMessage())),
            new HttpHeaders(), HttpStatus.UNAUTHORIZED, request);
    }

    @ExceptionHandler(value
        = {RuntimeException.class})
    protected ResponseEntity<Object> handleUnexpected(
        RuntimeException ex, WebRequest request) {
        return handleExceptionInternal(ex, new RestError(List.of(ex.getLocalizedMessage())),
            new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }
}
