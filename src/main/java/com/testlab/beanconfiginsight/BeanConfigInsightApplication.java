package com.testlab.beanconfiginsight;

import com.testlab.beanconfiginsight.model.MemberActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
public class BeanConfigInsightApplication implements CommandLineRunner{

	@Autowired
	private Membership membership;

	@Autowired
	private MemberActivity activity;

	@Autowired
	private GroupMember groupMember;

	public static void main(String[] args) {

		SpringApplication.run(BeanConfigInsightApplication.class, args);
	}

	public void run(String... args){

	}
}
