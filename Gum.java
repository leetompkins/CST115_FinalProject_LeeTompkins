
public class Gum extends Snack{

	
	
	Gum(){
		
	}
	
	Gum(String name, double price) {
		super.setName(name);
		super.setPrice(price);
	}
	
	Gum(Gum gum){
		super.setName(gum.getName());
		super.setPrice(gum.getPrice());
		super.image = gum.image; 
		super.calories = gum.calories; 
		super.sugar = gum.sugar;
	}
	
	
	@Override
	public String toString(){
		return "Gum Class";
	}
}
