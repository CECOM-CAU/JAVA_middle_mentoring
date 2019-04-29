public class ManageSnack {
    public  static void main(String[] args){
        Hotdog a = new SausageHotdog();
        Hotdog b = new MozzarellaHotdog();

        Takoyaki c = new NormalTakoyaki();
        Takoyaki d = new HotTakoyaki();

        붕어빵 e = new 팥붕어빵();
        붕어빵 f = new 피자붕어빵();


        System.out.println(a.digest().toString());
        System.out.println(b.digest().toString());
        System.out.println(c.digest().toString());
        System.out.println(d.digest().toString());
        System.out.println(e.digest().toString());
        System.out.println(f.digest().toString());

    }
}
