package in.bonakula.mdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories({"in.bonakula.mdemo.model", "in.bonakula.mdemo.repository"})
@SpringBootApplication
public class MdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdemoApplication.class, args);
	}
}
