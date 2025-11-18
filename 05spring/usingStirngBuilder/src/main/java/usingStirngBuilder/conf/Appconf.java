package usingStirngBuilder.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("usingStirngBuilder.bean")
@Import(usingStirngBuilder.test.StringTest.class)

public class Appconf {

}
