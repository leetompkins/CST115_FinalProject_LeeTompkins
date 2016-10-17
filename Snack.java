import javafx.scene.image.Image;

public abstract class Snack extends Product {
	protected int calories;
	protected int sugar;
	protected Image image; 
	
	// No args constructor 
	Snack() {

	}
	
	public Snack(Product product) {
		super(product);
		
	}

	public Snack(int calories, int sugar, Image image) {
		super();
		this.calories = calories;
		this.sugar = sugar;
		this.image = image;
	}

	@Override
	public String toString(){
		return "Snack Class";
	}

	/**
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * @param calories the calories to set
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}

	/**
	 * @return the sugar
	 */
	public int getSugar() {
		return sugar;
	}

	/**
	 * @param sugar the sugar to set
	 */
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	/**
	 * @return the image
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(Image image) {
		this.image = image;
	}
	
	public String compareTo(Product a, Product b){
		String compare = ""; 
		String aName = a.getName();
		String bName = b.getName();
		double aPrice = a.getPrice();
		double bPrice = b.getPrice();
		if(aName.charAt(0) < bName.charAt(0) && aPrice < bPrice ) {
			compare = "aName + " + "aPrice" + " , " +  bName + " " + bPrice;
		} else {
			if(aName.charAt(0) > bName.charAt(0) && aPrice > bPrice ) {
				compare = "bName + " + "bPrice" + " , " +  aName + " " + aPrice;
		} else {
			if(aName.charAt(0) == bName.charAt(0) && aPrice == bPrice ) {
				compare = "aName + " + "aPrice" + " , " +  bName + " " + bPrice;
			}
		}
		}
		return compare ;
				
	}
}
