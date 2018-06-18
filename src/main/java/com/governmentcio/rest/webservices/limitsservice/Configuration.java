/**
 * 
 */
package com.governmentcio.rest.webservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href=mailto:support@governmentcio.com>support</a>
 * 
 * Please document me!!
 */
@Component
@ConfigurationProperties("limits-service")
public class Configuration {

	private int maximum;
	private int minimum;

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

}
