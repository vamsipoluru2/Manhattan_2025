package usingStirngBuilder.test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class StringTest{

    @Bean  
    public StringBuilder stringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        return sb;
    }
}
