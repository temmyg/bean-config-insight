package com.testlab.beanconfiginsight;

import com.testlab.beanconfiginsight.model.RegistryEntry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class RegisterConfigure {
    @Bean
    public RegistryEntry registryEntry(){
        RegistryEntry entry = new RegistryEntry();
        entry.setRegisterNo(234);
        entry.setRegisterTime(new Date());
        return entry;
    }
}
