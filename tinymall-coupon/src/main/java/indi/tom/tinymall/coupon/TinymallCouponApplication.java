package indi.tom.tinymall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TinymallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinymallCouponApplication.class, args);
	}

}
