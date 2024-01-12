package realworld.db;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import realworld.entity.user.RegisterDAO;
import realworld.entity.user.UserDAO;
import realworld.entity.user.UserEntity;

import java.io.IOException;
import java.util.Objects;

@TestPropertySource(locations = "classpath:test.properties")
@SpringBootTest(classes = {UserService.class, UserServiceTest.class, ElasticClientTest.class})
public class UserServiceTest {

    @Autowired
    private UserService service;

    @Test
    public void testCreateUpdateUser() throws IOException {
        RegisterDAO register = new RegisterDAO("userr","mail","pw");
        UserEntity result = service.newUser(register);
        assert(result.username().equals(register.username()));
        assert(result.email().equals(register.email()));
        assert(result.password().equals(register.password()));
        assert(Objects.nonNull(result.token()));
        String token = "Token " + result.token();

        UserDAO update = new UserDAO("new-user","mail","","bio","image");
        result = service.updateUser(token, update);
        assert(result.username().equals(update.username()));
        assert(result.email().equals(update.email()));
        assert(result.bio().equals(update.bio()));
        assert(result.image().equals(update.image()));
    }
}
