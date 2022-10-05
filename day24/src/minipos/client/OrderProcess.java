package minipos.client;

import java.util.*;
import java.text.*;

public class OrderProcess {
	private ArrayList<Food> list;
	DecimalFormat df;
	Data[] data;
	
	public OrderProcess() {
		df = new DecimalFormat("###,###");
		data = Data.values();
		list = new ArrayList<>();
	}
	
	public void order(int i) {
		list.add(new Food(data[i].name(), data[i].getPrice()));
	}
	
	public ArrayList<Food> getList(){
		return list;
	}
	
	public void listClear() {
		list = new ArrayList<>();
	}
	
	public String getFood(){
		String text = "�� ��  �� �� ��\n";
		text += "============\n";
		int sum = 0;
		for(Food food : list) {
			text += food.getName()+"  "+df.format(food.getPrice())+"��\n";
			sum += food.getPrice();
		}
		text += "---------------------\n";
		text += "���� :  "+ df.format(sum) +"��";
		return text;
	}
}
