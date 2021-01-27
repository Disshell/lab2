package io.disshell.BlitzSpring;

import io.disshell.BlitzSpring.service.AskQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@RequiredArgsConstructor
public class BlitzSpringApplication implements CommandLineRunner {

	private final AskQuestionService askQuestionService;
	public static void main(String[] args) {
		SpringApplication.run(BlitzSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws IOException {
		askQuestionService.AskQuestion();
	}
}
