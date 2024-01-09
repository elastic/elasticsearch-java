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
import realworld.entity.article.Tags;

import java.io.IOException;

@CrossOrigin()
@RestController
@RequestMapping("/tags")
public class TagsController {

    private ArticleService service;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    public TagsController(ArticleService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<Tags> get() throws IOException {
        Tags res = service.allTags();
        return ResponseEntity.ok(res);
    }
}
