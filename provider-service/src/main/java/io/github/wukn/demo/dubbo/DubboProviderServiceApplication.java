package io.github.wukn.demo.dubbo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DubboProviderServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboProviderServiceApplication.class).web(WebApplicationType.NONE).run(args);
        // SpringApplication.run(DubboProviderServiceApplication.class, args);
    }
}
