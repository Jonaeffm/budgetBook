package budgetBook;

import java.sql.Date;

public class budget {
	private int id;
	private Date date;
	private String product;
	private double price;
	
	public budget(Date d,String p, double pr)
	{
		setDate(d);
		setProduct(p);
		setPrice(pr);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
