package com.testlab.beanconfiginsight;

import com.testlab.beanconfiginsight.model.ClubMember;
import com.testlab.beanconfiginsight.model.MemberActivity;
import com.testlab.beanconfiginsight.model.RegistryEntry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration(classes = { ClubMemberConfig.class, RegisterConfigure.class })
@ContextConfiguration(classes = ClubMgmtConfig.class)
public class BeanConfigInsightApplicationTests {

	@Autowired
	ClubMember clubMember;

	@Autowired
	RegistryEntry registryEntry;

	@Autowired
	MemberActivity activity;

	@Test
	public void contextLoads() {

	}

}
