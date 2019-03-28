

public class StockExchange extends Company{

	
	static Share intel = new Share("intel");
	static Share apple = new Share("apple");
	
	
	public static void main(String[] args) {
						
		Company TradeComp = new Company();
		TradeComp.buyShares(intel);
		TradeComp.buyShares(apple);
		
		System.out.println(intel);
		System.out.println(apple);
		
		TradeComp.sellShares(intel);
		TradeComp.sellShares(apple);
		
		System.out.println((portfolio).size());
	
	}

}
