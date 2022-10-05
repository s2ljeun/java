package minipos.client;

public enum Data{
	Â¥Àå(4000), Â«»Í(6000), ÇÇÀÚ(12000), Á·¹ß(20000), º¸½Ó(24000),
	Ä¡Å²(17000), ´ß¹ß(18000), ¼ø´ë(3000), °öÃ¢(15000);

	int price;

	Data(int price){
		this.price = price;
	}
		
	public int getPrice() {
		return price;
	}
		
}
