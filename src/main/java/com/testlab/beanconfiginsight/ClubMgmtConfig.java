package com.testlab.beanconfiginsight;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({ClubMemberConfig.class, RegisterConfigure.class})
@ImportResource("classpath:application-context.xml")
public class ClubMgmtConfig {
}
