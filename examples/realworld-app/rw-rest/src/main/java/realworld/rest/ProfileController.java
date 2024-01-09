package realworld.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import realworld.db.UserService;
import realworld.entity.user.Profile;

import java.io.IOException;

@CrossOrigin()
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
    public ResponseEntity<Profile> get(@PathVariable String username, @RequestHeader("Authorization") String auth) throws IOException {
        Profile res = service.getUserProfile(username, auth);
        logger.debug("Returning profile for user {}", res.username());
        return ResponseEntity.ok(res);
    }

    @PostMapping("/{username}/follow")
    public ResponseEntity<Profile> follow(@PathVariable String username, @RequestHeader("Authorization") String auth) throws IOException {
        Profile res = service.followUser(username, auth);
        logger.debug("Following user {}", res.username());
        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/{username}/follow")
    public ResponseEntity<Profile> unfollow(@PathVariable String username, @RequestHeader("Authorization") String auth) throws IOException {
        Profile res = service.unfollowUser(username, auth);
        logger.debug("Unfollowing user {}", res.username());
        return ResponseEntity.ok(res);
    }
}
