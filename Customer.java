package com.project.hibernateproject1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="Customer_Information") //giving name to the table
@Entity(name="Customer_Details")
public class Customer
{
	
	@Id     //declare id as a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Customer_ID")
	private int cid;
	@Column(name="Customer_Name")
	private String cname;
	
	@OneToOne //one to one connection
	@JoinColumn(name="Product_ID")
	private Product product;
    
	
	//constructor
	
	public Customer(int cid, String cname, Product product)
	{
		super();
		this.cid = cid;
		this.cname = cname;
		this.product = product;
	}

   //we generate constructor from superclass
	public Customer()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//we use getter & setter here
	public int getCid()
	{
		return cid;
	}

	public void setCid(int cid)
	{
		this.cid = cid;
	}

	public String getCname()
	{
		return cname;
	}

	public void setCname(String cname)
	{
		this.cname = cname;
	}

	public Product getProduct()
	{
		return product;
	}

	public void setProduct(Product product)
	{
		this.product = product;
	}
}
     


	