package minipos.client;

public enum Data{
	¥��(4000), «��(6000), ����(12000), ����(20000), ����(24000),
	ġŲ(17000), �߹�(18000), ����(3000), ��â(15000);

	int price;

	Data(int price){
		this.price = price;
	}
		
	public int getPrice() {
		return price;
	}
		
}
