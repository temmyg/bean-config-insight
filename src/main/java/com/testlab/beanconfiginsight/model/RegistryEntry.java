package com.testlab.beanconfiginsight.model;

import java.util.Date;

public class RegistryEntry {

    private int registerNo;

    private Date registerTime;

    public int getRegisterNo() {
        return registerNo;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public void setRegisterNo(int registerNo) {
        this.registerNo = registerNo;
    }
}
