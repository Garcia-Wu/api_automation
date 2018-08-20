package org.gt.projects.api.core.spring.properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:api_test.properties")
public class PropFileConfig {
}
