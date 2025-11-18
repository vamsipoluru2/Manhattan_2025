package usingStirngBuilder.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StringClass {
	    @Autowired
    private StringBuilder stringBuilder;
    
    




	public void setStringBuilder(StringBuilder stringBuilder) {
		this.stringBuilder = stringBuilder;
	}

	


	
	public void printMessage() {
        stringBuilder.append(" World!");
        System.out.println(stringBuilder.toString());
    }
}