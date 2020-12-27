package indi.tom.tinymall.product;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import indi.tom.tinymall.product.service.BrandService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TinymallProductApplicationTests {
	
	@Autowired
	BrandService couponService;
	
	@Test
	public void test() {
		
		System.out.println(couponService);
		
	}
	

}
