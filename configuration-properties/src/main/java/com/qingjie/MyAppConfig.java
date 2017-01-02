package com.qingjie;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myconfig")
public class MyAppConfig {

	private String appName;
	private String appDesc;
	private String adminFirstName;
	private String adminLastName;
	private String adminEmail;

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppDesc() {
		return appDesc;
	}

	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

	public String getAdminFirstName() {
		return adminFirstName;
	}

	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}

	public String getAdminLastName() {
		return adminLastName;
	}

	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	@Override
	public String toString() {
		return "MyAppConfig [appName=" + appName + ", appDesc=" + appDesc + ", adminFirstName=" + adminFirstName
				+ ", adminLastName=" + adminLastName + ", adminEmail=" + adminEmail + "]";
	}

}
