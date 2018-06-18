/**
 * 
 */
package com.governmentcio.rest.webservices.limitsservice.bean;

/**
 * 
 * @author <a href=mailto:support@governmentcio.com>support</a>
 * 
 * Please document me!!
 */
public class LimitConfiguration {

	private int minimum;
	private int maximum;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LimitConfiguration [minimum=");
		builder.append(minimum);
		builder.append(", maximum=");
		builder.append(maximum);
		builder.append("]");
		return builder.toString();
	}

}
