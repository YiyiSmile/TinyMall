package indi.tom.tinymall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TinymallWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinymallWareApplication.class, args);
	}

}
