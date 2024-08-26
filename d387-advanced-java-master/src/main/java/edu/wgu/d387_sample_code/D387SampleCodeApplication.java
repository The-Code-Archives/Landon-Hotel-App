package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.message.TranslateMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {

		SpringApplication.run(D387SampleCodeApplication.class, args);

		TranslateMessage translateMessageEN = new TranslateMessage(Locale.US);
		Thread enThread = new Thread(translateMessageEN);
		enThread.start();

		TranslateMessage translateMessageFR = new TranslateMessage(Locale.CANADA_FRENCH);
		Thread frThread = new Thread(translateMessageFR);
		frThread.start();
	}

}
