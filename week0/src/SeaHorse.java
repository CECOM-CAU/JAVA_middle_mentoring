public class SeaHorse extends Animal{
   //보현
   void eat(Animal animal) {
      System.out.println("Seahorse eats"+animal);
   }
   int move(Direction d) {
      System.out.println(d.x+"로 "+d.size+"만큼 움직이기");
      return d.size;
   }
   void sleep() {
      System.out.println("Seahorse is sleeping");
   }
   void poo() {
      System.out.println("Seahorse is not poo today");
   }
   
   void swim() {
      System.out.println("Swimming~");
   }
}