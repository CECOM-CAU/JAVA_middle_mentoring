public class Whale extends Animal{
   //보현
   void eat(Animal animal) {
      System.out.println("Whale eats"+animal);
   }
   int move(Direction d) {
      System.out.println(d.z+"로 "+d.size+"만큼 움직이기");
      return d.size;
   }

   void sleep() {
      System.out.println("Whale is not sleeping");
   }
   void poo() {
      System.out.println("poo yesterday");
   }
   void dive(){
      System.out.println("dive");
   }
}