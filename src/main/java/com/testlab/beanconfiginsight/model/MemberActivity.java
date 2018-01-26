package com.testlab.beanconfiginsight.model;

import java.time.Duration;

public class MemberActivity {
    private String device;
    private Duration duration;

    public MemberActivity(String device, Duration duration){
        this.duration = duration;
        this.device = device;
    }
}
