public class pig extends Animal {                  //정어진
   void eat(Animal animal){
      System.out.println(animal+" 맛있당 ㅎㅎㅎ 냠냠");
   };
   int move(Direction d){
	   System.out.println(d.x+"칸 앞으로"+d.y+"칸 오른쪽으로"+d.z+"칸 위로 움직인다.");
      int a = (int) (Math.pow(d.x, 2)+Math.pow(d.y, 2)+Math.pow(d.z, 2));
      return (int) Math.sqrt(a);
   }
   void sleep() {
      System.out.println("쿨쿨");
   }
   void poo() {
      System.out.println("실례했습니다^^");
   }
   void sound() {
      System.out.println("꿀꿀~꿀꿀꿀~꿀꿀~꿀꿀~");
   }
   void gender(int sex) {
      if(sex==0) {
         System.out.println("이 돼지는 수컷이다!");
      }
      else {
         System.out.println("이 돼지는 암컷이다!");
      }
   }
}