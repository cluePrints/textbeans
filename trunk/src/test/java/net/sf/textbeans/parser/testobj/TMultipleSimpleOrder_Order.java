package net.sf.textbeans.parser.testobj;

import java.math.BigDecimal;

public class TMultipleSimpleOrder_Order implements Comparable<TMultipleSimpleOrder_Order>{
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
	
	// this stuff is trick to guarantee consistent ordering so test will always run(or fail)
	@Override
	public int compareTo(TMultipleSimpleOrder_Order o) {
		if (!(o instanceof TMultipleSimpleOrder_Order)) {
			return -1;
		}
		return hashCode() - o.hashCode();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + feeIntPrimitive;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TMultipleSimpleOrder_Order other = (TMultipleSimpleOrder_Order) obj;
		if (feeIntPrimitive != other.feeIntPrimitive)
			return false;
		return true;
	}
}
