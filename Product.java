package com.project.hibernateproject1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="Product_Information") //giving name to the table
@Entity(name="Product_Details")
public class Product  
{
	
	@Id     //declare id as a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Product_ID")
	private int pid;
	@Column(name="Product_Name")
	private String pname;
	
	 @OneToOne //one to one connection
	 @JoinColumn(name="Customer_ID")
	 private Customer customer;

	//constructor
	public Product(int pid, String pname, Customer customer)
	{
		super();
		this.pid = pid;
		this.pname = pname;
		this.customer = customer;
	}

	//we generate constructor from superclass
	public Product()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//we use getter & setter here
	public int getPid()
	{
		return pid;
	}

	public void setPid(int pid)
	{
		this.pid = pid;
	}

	public String getPname()
	{
		return pname;
	}

	public void setPname(String pname)
	{
		this.pname = pname;
	}

	public Customer getCustomer()
	{
		return customer;
	}

	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
}
	 