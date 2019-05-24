package com.mongcent.tnaot.api.core.spring.properties;

import com.mongcent.tnaot.api.core.spring.properties.models.Application;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({Application.class})
public class YAMLConfig {
}
