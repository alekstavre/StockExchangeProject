import java.util.Scanner;

public class Company {

	Scanner scan = new Scanner(System.in);
	String name;
	static LinkedQueue<Share> portfolio= new LinkedQueue<Share>();
	int priceDiff;
	int randomVal;

	public void buyShares(Share share) {
		System.out.println("nbr of "+ share.getName()+ " shares to buy:");
		int nbrOfShares = scan.nextInt();
		share.setNumber(nbrOfShares);
		randomVal= (int)(Math.random()*150+1);
		share.setValue(randomVal);
		for(int i=0;i<nbrOfShares;i++) {
			portfolio.enqueue(share);			
		}		
	}	
	public void sellShares(Share share){
		System.out.println("nbr of "+ share.getName()+ " to sell:");
		int sharesToSell = scan.nextInt();
		int newValue = (int)(Math.random()*150+1);
		System.out.println("Sold :"+ sharesToSell + " shares of "
		+share.getName()+" by price="+ newValue+"$");
		for(int i=0;i<sharesToSell;i++) {
			priceDiff=share.getValue()-newValue;
			if(priceDiff==0)
				System.out.println("no gain or loss");
			else if(share.getValue()<newValue) {
				System.out.println("profit of: "+Math.abs(priceDiff)+"$");
			}
			else 
				System.out.println("loss of: "+Math.abs(priceDiff)+"$");
			portfolio.dequeue();
		}
	}	
	
}
