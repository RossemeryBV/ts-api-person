package com.jk.person.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("api-client")
public class ConfigurationTemporal {
	
	private int minnum;
	private int maxnum;
	
	
	public int getMinnum() {
		return minnum;
	}
	public void setMinnum(int minnum) {
		this.minnum = minnum;
	}
	public int getMaxnum() {
		return maxnum;
	}
	public void setMaxnum(int maxnum) {
		this.maxnum = maxnum;
	}
	
	

}
