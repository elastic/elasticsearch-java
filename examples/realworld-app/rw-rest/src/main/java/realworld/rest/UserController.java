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

package realworld.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import realworld.db.UserService;
import realworld.entity.user.LoginDAO;
import realworld.entity.user.RegisterDAO;
import realworld.entity.user.UserDAO;
import realworld.entity.user.UserEntity;

import java.io.IOException;

@CrossOrigin()
@RestController
@RequestMapping()
public class UserController {

    private UserService service;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/users")
    public ResponseEntity<UserDAO> register(@RequestBody RegisterDAO req) throws IOException {
        UserEntity res = service.newUser(req);
        logger.debug("Registered new user {}", req.username());
        return ResponseEntity.ok(new UserDAO(res));
    }

    @PostMapping("users/login")
    public ResponseEntity<UserDAO> login(@RequestBody LoginDAO req) throws IOException {
        UserEntity res = service.login(req);
        logger.debug("User {} logged in", res.username());
        return ResponseEntity.ok(new UserDAO(res));
    }

    @GetMapping("/user")
    public ResponseEntity<UserDAO> get(@RequestHeader("Authorization") String auth) throws IOException {
        UserEntity res = service.getUserEntityFromToken(auth);
        logger.debug("Returning info about user {}", res.username());
        return ResponseEntity.ok(new UserDAO(res));

    }

    @PutMapping("/user")
    public ResponseEntity<UserDAO> update(@RequestHeader("Authorization") String auth,
                                          @RequestBody UserDAO req) throws IOException {
        UserEntity res = service.updateUser(auth, req);
        logger.debug("Updated info for user {}", req.username());
        return ResponseEntity.ok(new UserDAO(res));

    }
}
