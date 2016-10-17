
public class Candy extends Snack{

	
	// No args constructor 
	Candy(){
		
	}
	
	Candy(String name, double price) {
		super.setName(name);
		super.setPrice(price);
	}
	
	Candy(Candy candy){
		super.setName(candy.getName());
		super.setPrice(candy.getPrice());
		super.image = candy.image; 
		super.calories = candy.calories; 
		super.sugar = candy.sugar;
	}
	
	@Override 
	public String toString(){
		return "Candy Class"; 
	}
}
