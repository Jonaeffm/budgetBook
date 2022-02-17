package budgetBook;

import java.sql.Date;

public class budget {
	private int id;
	private Date date;
	private String product;
	private Double price;
	
	public budget(Date d,String p, Double pr)
	{
		setDate(d);
		setProduct(p);
		setPrice(pr);
	}
	
	public budget()
	{
		
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
