public class Hotdog extends Snack {
	String content;
	boolean sugar_exis;
	boolean ketchup_exis;
	
	boolean is_sugar_exis(boolean sugar_exis) {
		if(sugar_exis)
			return true;
		else
			return false;
	}
	boolean is_ketchup(boolean ketchup_exis) {
		if(ketchup_exis)
			return true;
		else
			return false;
	}	
	
	public String toString() {
		return this.content;
	}
}
