package net.sf.textbeans.parser.testobj;

public class TLRTableConflictDisambiguation_Order {
	private Integer id;
	private Integer price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", price="
				+ price + "]";
	}
}
