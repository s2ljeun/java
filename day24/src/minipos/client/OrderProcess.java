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
		String text = "주 문  내 역 서\n";
		text += "============\n";
		int sum = 0;
		for(Food food : list) {
			text += food.getName()+"  "+df.format(food.getPrice())+"원\n";
			sum += food.getPrice();
		}
		text += "---------------------\n";
		text += "가격 :  "+ df.format(sum) +"원";
		return text;
	}
}
