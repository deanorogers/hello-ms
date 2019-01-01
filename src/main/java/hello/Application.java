package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@RestController
public class Application {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String home() {
        logger.debug("About to issue salutation");
        return "Hello Arthur Rogers";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
