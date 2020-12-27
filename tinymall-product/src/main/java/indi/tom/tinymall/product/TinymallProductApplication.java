package indi.tom.tinymall.product;

import java.util.Arrays;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import indi.tom.tinymall.product.service.BrandService;


@MapperScan("indi.tom.tinymall.product.dao")
@SpringBootApplication
public class TinymallProductApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(TinymallProductApplication.class, args);
		String[] namesForType = ac.getBeanNamesForType(BrandService.class);
		System.out.println(Arrays.toString(namesForType));
		
	}

}
