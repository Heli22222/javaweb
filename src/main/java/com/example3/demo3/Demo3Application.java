package com.example3.demo3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("com.example3.demo3.dao")
public class Demo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

	/*@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
*/

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();

		HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory
				= new HttpComponentsClientHttpRequestFactory();
		httpComponentsClientHttpRequestFactory.setConnectTimeout(1000);
		httpComponentsClientHttpRequestFactory.setReadTimeout(1000);

		restTemplate.setRequestFactory(httpComponentsClientHttpRequestFactory);

		return restTemplate;
	}

}



