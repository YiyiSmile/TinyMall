package indi.tom.tinymall.gateway;

import javax.activation.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TinymallGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinymallGatewayApplication.class, args);
	}

}
