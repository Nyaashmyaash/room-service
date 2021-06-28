package com.nyash.rooms.roomservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class RoomServiceApplication {

//    @Bean
//    public Docket api(){
//        return new Docket(DocumentationType.SWAGGER_2).groupName("Room").select()
//                .apis(RequestHandlerSelectors.basePackage("com.nyash.rooms.roomservice"))
//                .paths(any()).build().apiInfo(new ApiInfo("Room Services",
//                        "A set of services to provide data access to rooms", "1.0.0", null, null,
//                        null, null));
//    }

    public static void main(String[] args) {
        SpringApplication.run(RoomServiceApplication.class, args);
    }
}
