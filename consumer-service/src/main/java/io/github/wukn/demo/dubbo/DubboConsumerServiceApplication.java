package io.github.wukn.demo.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import io.github.wukn.demo.dubbo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DubboConsumerServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboConsumerServiceApplication.class).web(WebApplicationType.NONE).run(args);
        // SpringApplication.run(DubboConsumerServiceApplication.class, args);
    }

    @Reference
    private UserService userService;

    @Bean
    public CommandLineRunner run() {
        return args -> {
            boolean result = userService.login("admin", "123456");
            System.out.println("is user admin can login: " + result);
            result = userService.login("wukn", "666666");
            System.out.println("is user wukn can login: " + result);


        };
    }
}
