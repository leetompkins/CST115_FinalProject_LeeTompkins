
public class Dispensor {
	private int productInventoryCapacity = 10; 
	private Product[] productArray =new Product[productInventoryCapacity];
	
	
	
	
	
	// No args Constructor
	public Dispensor() {
		
	}
	
	public Dispensor(int productInventoryCapacity) {
		this.productInventoryCapacity = productInventoryCapacity;
		Drink dA = new Drink();
		Drink dB = new Drink();
		Drink dC = new Drink();
		Drink dD = new Drink();
		Drink dE = new Drink();
		Candy cA = new Candy();
		Candy cB = new Candy();
		Chips cC = new Chips();
		Chips cD = new Chips();
		Gum gA = new Gum();
		
		
		productArray[0] = dA;
		productArray[1] = dB;
		productArray[2] = dC;
		productArray[3] = dD;
		productArray[4] = dE;
		productArray[5] = cA;
		productArray[6] = cB;
		productArray[7] = cC;
		productArray[8] = cD;
		productArray[9] = gA;
	}
	
	
	public String displayProduct(){
		for (int i = 0; i < productInventoryCapacity; i++) {
			System.out.println(productArray[i].toString());
		}
		return "";
	}
	
	
	
	
	
	
	

}
