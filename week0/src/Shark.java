public class Shark extends Animal{
   //보현
   void eat(Animal animal) {
      System.out.println("Shark eats"+animal);
   }
   int move(Direction d) {
      System.out.println(d.y+"로 "+d.size+"만큼 움직이기");
      return d.size;
   }
   void sleep() {
      System.out.println("not sleeping");
   }
   void poo() {
      System.out.println("poo today");
   }
   void attack() {
      System.out.println("attack!");
   }
}