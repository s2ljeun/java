package minipos.client;

import java.io.Serializable;

public class Food implements Serializable{
	private String name;
	private int price;
	private int count;
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
		this.count = 1;
	}
	
	public void plusCount() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
