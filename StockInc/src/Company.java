import java.util.Scanner;

public class Company {

	Scanner scan = new Scanner(System.in);
	String name;
	static LinkedQueue<Share> portfolio= new LinkedQueue<Share>();
	int nbrOfShares;
	int randomVal;

	public void buyShares(Share share) {
		System.out.println("nbr of "+ share.getName()+ " shares to buy:");
		nbrOfShares = scan.nextInt();
		share.setNumber(nbrOfShares);
		randomVal= (int)(Math.random()*150+1);
		share.setValue(randomVal*nbrOfShares);
		for(int i=0;i<nbrOfShares;i++) {
			portfolio.enqueue(share);			
		}		
	}
	
	public void sellShares(int sharesToSell, int value){
		System.out.println("nbr of shares to sell:");
		sharesToSell = scan.nextInt();
		value= (int)(Math.random()*150+1);
		portfolio.dequeue();
	}
}
