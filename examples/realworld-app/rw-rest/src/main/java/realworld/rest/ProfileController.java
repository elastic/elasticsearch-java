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
import realworld.document.user.Profile;

import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/profiles")
public class ProfileController {

    private UserService service;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    public ProfileController(UserService service) {
        this.service = service;
    }

    @GetMapping("/{username}")
    public ResponseEntity<Profile> get(@PathVariable String username,
                                       @RequestHeader("Authorization") String auth) throws IOException {
        Profile res = service.findUserProfile(username, auth);
        logger.debug("Returning profile for user {}", res.username());
        return ResponseEntity.ok(res);
    }

    @PostMapping("/{username}/follow")
    public ResponseEntity<Profile> follow(@PathVariable String username,
                                          @RequestHeader("Authorization") String auth) throws IOException {
        Profile res = service.followUser(username, auth);
        logger.debug("Following user {}", res.username());
        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/{username}/follow")
    public ResponseEntity<Profile> unfollow(@PathVariable String username,
                                            @RequestHeader("Authorization") String auth) throws IOException {
        Profile res = service.unfollowUser(username, auth);
        logger.debug("Unfollowing user {}", res.username());
        return ResponseEntity.ok(res);
    }
}
