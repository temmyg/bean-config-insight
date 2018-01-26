package com.testlab.beanconfiginsight;

import com.testlab.beanconfiginsight.model.ClubMember;
import com.testlab.beanconfiginsight.model.RegistryEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Membership {

    @Autowired
    private ClubMember member;

    @Autowired
    private RegistryEntry entry;
}
