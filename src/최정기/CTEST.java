package EX;


class Seller{
	private int MyMoney;
	private int AppleCnt;
	public int Price;
	
	public Seller(int myMoney, int appleCnt, int price) {
		super();
		MyMoney = myMoney;
		AppleCnt = appleCnt;
		Price = price;
	}
	public int Receive(int money) {

		MyMoney += money;
	
		int revcnt = money/Price+1;
	
		AppleCnt -= revcnt;
	 
		return revcnt;
	}
	public void ShowInfo() {
		
		System.out.println("----판매자정보----");
		System.out.println("보유금액 : "+ MyMoney);
		System.out.println("사과 개수 : " + AppleCnt);
		System.out.println("개당가격 : " + Price);
		
	}
}

class Buyer{
	private int MyMoney;
	private int AppleCnt;
	private String name;
	
	public Buyer(String name, int myMoney, int appleCnt) {
		super();
		this.name = name;
		MyMoney = myMoney;
		AppleCnt = appleCnt;
		
	}
	public void Payment(Seller seller, int money) {

		MyMoney = money;
	
		int cnt = seller.Receive(money);
	
		AppleCnt += cnt;
	}
	public void ShowInfo() {
	
		System.out.println("----구매자정보----");
		System.out.println(""+ name);
		System.out.println("보유금액 : "+ MyMoney);
		System.out.println("사과 개수 : " + AppleCnt);
				
		
	}
}



public class CTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Seller 사과장수1 = new Seller(100000,100,1000);		
		Buyer buyer1 = new Buyer("buyer01", 8000,0);			
		Buyer buyer2 = new Buyer("buyer02",15000,5);
		Buyer buyer3 = new Buyer("buyer03",27000,3);
		
		buyer1.Payment(사과장수1,10000);
		
		
		
		사과장수1.ShowInfo();
		buyer1.ShowInfo();
		
		buyer2.ShowInfo();
		buyer3.ShowInfo();
		

		
	}

}
