package net.sf.textbeans.parser.testobj;

import java.math.BigDecimal;

public class TSingleTokenToMultiFields_Order {
	private String id;
	private BigDecimal feeBd;
	private Long feeLong;
	private int feeIntPrimitive;
	private String feeStr;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BigDecimal getFeeBd() {
		return feeBd;
	}
	public void setFeeBd(BigDecimal feeBd) {
		this.feeBd = feeBd;
	}
	public Long getFeeLong() {
		return feeLong;
	}
	public void setFeeLong(Long feeLong) {
		this.feeLong = feeLong;
	}
	public int getFeeIntPrimitive() {
		return feeIntPrimitive;
	}
	public void setFeeIntPrimitive(int feeIntPrimitive) {
		this.feeIntPrimitive = feeIntPrimitive;
	}
	public String getFeeStr() {
		return feeStr;
	}
	public void setFeeStr(String feeStr) {
		this.feeStr = feeStr;
	}	
}
