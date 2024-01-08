package realworld.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import realworld.db.UserService;
import realworld.entity.user.User;
import realworld.entity.user.UserDAO;

import java.io.IOException;
import java.util.Objects;

import static realworld.utils.Utility.isNullOrBlank;


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
    public ResponseEntity<User> register(@RequestBody UserDAO req) throws IOException {
        // TODO consider adding validator
        if (isNullOrBlank(req.email()) || isNullOrBlank(req.username()) || isNullOrBlank(req.password())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .header("EXCEPTION", "missing required field(s)")
                    .body(null);
        }
        UserDAO res = service.newUser(req);
        logger.debug("Registered new user {}", req.username());
        return ResponseEntity.ok(new User(res));
    }

    @PostMapping("users/login")
    public ResponseEntity<User> login(@RequestBody UserDAO req) throws IOException {
        if (isNullOrBlank(req.email()) || isNullOrBlank(req.password())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .header("EXCEPTION", "missing required field(s)")
                    .body(null);
        }
        UserDAO res = service.login(req);
        logger.debug("User {} logged in", req.username());
        return ResponseEntity.ok(new User(res));
    }

    @GetMapping("/user")
    public ResponseEntity<User> get(@RequestHeader("Authorization") String auth) throws IOException {
        UserDAO res = service.getUserFromToken(auth);
        logger.debug("Returning info about user {}", res.username());
        return ResponseEntity.ok(new User(res));

    }

    @PutMapping("/user")
    public ResponseEntity<User> update(@RequestHeader("Authorization") String auth, @RequestBody User req) throws IOException {
        UserDAO res = service.updateUser(auth, req);
        logger.debug("Updated info for user {}", req.username());
        return ResponseEntity.ok(new User(res));

    }
}
