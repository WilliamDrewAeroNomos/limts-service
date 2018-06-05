/**
 * 
 */
package com.in28minutes.rest.webservices.limitsservice.bean;

/**
 * @author <a href=mailto:support@aeronomos.org>aeronomos</a>
 * 
 *         Please document me!!
 */
public class LimitConfiguration {

	private int maximum;
	private int minimum;

	protected LimitConfiguration() {
	}

	/**
	 * @param maximum
	 * @param minimum
	 */
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

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
