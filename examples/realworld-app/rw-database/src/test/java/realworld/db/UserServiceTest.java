package realworld.db;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.testcontainers.elasticsearch.ElasticsearchContainer;
import realworld.entity.user.RegisterDAO;
import realworld.entity.user.UserEntity;

import java.io.IOException;
import java.time.Duration;

@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource(locations = "classpath:test.properties")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@ComponentScan
@SpringBootTest(classes = {UserService.class, UserServiceTest.class})
public class UserServiceTest {

    @Value("${elasticsearch.server.url}")
    private String serverUrl;

    @Autowired
    private UserService service;

    private volatile ElasticsearchContainer container;
    private static final String image = "docker.elastic.co/elasticsearch/elasticsearch:8.11.0";


    // TODO this doesn't work
    @Before
    public void start(){
        int port = Integer.valueOf(serverUrl.split(":")[2]);
        container = new ElasticsearchContainer(image)
                .withEnv("ES_JAVA_OPTS", "-Xms256m -Xmx256m")
                .withEnv("path.repo", "/tmp") // for snapshots
                .withStartupTimeout(Duration.ofSeconds(30))
                .withExposedPorts(port)
                .withReuse(true)
                .withPassword("test");
        container.start();
    }

    @After
    public void stop(){
        container.stop();
    }

    @Test
    public void testCreateUser() throws IOException {
        RegisterDAO register = new RegisterDAO("userr","mail","pw");
        UserEntity result = service.newUser(register);
        assert(result.username().equals(register.username()));
        assert(result.email().equals(register.email()));
        assert(result.password().equals(register.password()));
    }

}
