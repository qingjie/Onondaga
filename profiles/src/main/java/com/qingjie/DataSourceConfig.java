package com.qingjie;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myconfig")
public class DataSourceConfig {

	@Bean(name="datasource")
	@Profile("dev")
	DataSource dev() {
		return new DataSource("my-dev-url", 9999);
	}

	@Bean(name="datasource")
	@Profile("prod")
	DataSource prod() {
		return new DataSource("my-prod-url", 9999);
	}
	
}
