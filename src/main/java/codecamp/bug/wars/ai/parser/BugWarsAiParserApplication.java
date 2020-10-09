package codecamp.bug.wars.ai.parser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BugWarsAiParserApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugWarsAiParserApplication.class, args);
	}

}
