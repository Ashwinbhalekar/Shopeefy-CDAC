package com.shopeefy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(
    title="Ecommerce Project Api Using Springboot",
    description="Step into the boundless possibilities of our eCommerce Project API documentation! "
    		+ "Here, amidst the digital tapestry of our platform's capabilities,"
    		+ " you'll find a gateway to seamless integration and boundless innovation."
    		+ " Embrace the power to craft bespoke applications, forge intricate integrations, "
    		+ "and orchestrate automated marvels within the vibrant landscape of our online store."
    		+ " Welcome to a realm where functionality meets finesse, where every endpoint unveils a new realm of possibility. "
    		+ "Let the journey begin!",
    version="v1",
    contact=@Contact(
        name="Team SoftPolynomial Nagpur",
        email="dhoteh020@gmail.com"
    ),
    license=@License(
        name="14harshaldhote"
    )
))
public class ShopeefyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopeefyServerApplication.class, args);
	}

}
