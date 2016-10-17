
public class Chips extends Snack {
	
	
	// No Args Constructor
	Chips(){
		
	}
	Chips(String name, double price) {
		super.setName(name);
		super.setPrice(price);
	}
	
	Chips(Chips chips){
		super.setName(chips.getName());
		super.setPrice(chips.getPrice());
		super.image = chips.image; 
		super.calories = chips.calories; 
		super.sugar = chips.sugar;
	}
	
	
	@Override
	public String toString(){
		return "Chips Class";
	}

}
