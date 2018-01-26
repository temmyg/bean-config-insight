package com.testlab.beanconfiginsight;

import com.testlab.beanconfiginsight.model.ClubMember;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClubMemberConfig {

    @Bean(name = "clubMember")
    public ClubMember clubMember(){
        ClubMember member = new ClubMember();
        member.setfirstName("Alicson");
        member.setlastName("Utah");
        return member;
    }
}
