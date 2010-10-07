package net.sf.textbeans.parser;

import java.math.BigDecimal;

class OneLineBean {
	private String id;
	private BigDecimal fee;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BigDecimal getFee() {
		return fee;
	}
	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}
}
