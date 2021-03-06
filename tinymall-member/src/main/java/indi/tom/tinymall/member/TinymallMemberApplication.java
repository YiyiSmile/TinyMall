package indi.tom.tinymall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * 
 * Steps to implement the remote invoking:
 * 
 * 1. import open feign
 * 2. define a interface used for remote calling
 *    a. Use @FeignClient("tinymall-coupon") on the interface to tell spring cloud which service this interface is binded to.
 *    b. Use @RequestMapping("/coupon/coupon/member/list") to tell which URL is used to call the remote method
 *    c. The method signature in the Interface should has the exactly same name as the remote method
 * 3. Enable the open feign remote call feature by adding @EnableFeignClients(basePackages = "indi.tom.tinymall.member.feign") on 
 *    the main class.
 *
 */
@EnableFeignClients(basePackages = "indi.tom.tinymall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class TinymallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinymallMemberApplication.class, args);
	}

}
