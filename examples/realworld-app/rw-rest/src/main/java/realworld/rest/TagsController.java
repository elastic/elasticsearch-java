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
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import realworld.db.ArticleService;
import realworld.document.article.TagsDTO;

import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/tags")
public class TagsController {

    private final ArticleService service;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    public TagsController(ArticleService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<TagsDTO> get() throws IOException {
        TagsDTO res = service.findAllTags();
        logger.debug("Retrieved all tags");
        return ResponseEntity.ok(res);
    }
}
