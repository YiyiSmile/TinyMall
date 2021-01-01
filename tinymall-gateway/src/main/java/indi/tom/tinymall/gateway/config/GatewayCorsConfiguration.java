package indi.tom.tinymall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @Author: Tom
 * @Date: 2021年1月1日 下午12:46:24   
 * @Version: 1.0
 * @Description: Configure CORS for the tiny mall project
 */

@Configuration
public class GatewayCorsConfiguration {
	
	@Bean
	public CorsWebFilter corsWebFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		//configure cors
		corsConfiguration.addAllowedOrigin("*");
		corsConfiguration.addAllowedMethod("*");
		corsConfiguration.addAllowedHeader("*");
		corsConfiguration.setAllowCredentials(true);
		
		source.registerCorsConfiguration("/**", corsConfiguration);
		
		return new CorsWebFilter(source);
	}

}
