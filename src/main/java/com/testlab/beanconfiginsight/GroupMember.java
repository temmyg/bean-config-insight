package com.testlab.beanconfiginsight;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GroupMember {
    private String name;

    public String getName() {
        return name;
    }

    @Value("Teda")
    public void GroupMember(String name){
        this.name = name;
    }

    @Value("Jones")
    public void setName(String name) {
        this.name = name;
    }
}
