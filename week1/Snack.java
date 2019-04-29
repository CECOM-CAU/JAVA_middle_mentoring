package snack_hj;

abstract class Snack {
    public String sName;
    public String company;
    public int expiryDate;
    public int price; 
    public int kcal; 
    
    abstract class Nutrition {
    	abstract void eat(Snack snack);
    	abstract void eaten();
    	abstract void digest();
    	abstract boolean isSpoid();
    }
}
