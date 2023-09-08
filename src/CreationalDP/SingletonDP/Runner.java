package CreationalDP.SingletonDP;

public class Runner {
    public static void main(String[] args) {

//        SingletonObject object1=new SingletonObject();
//        SingletonObject object2=new SingletonObject();
        //farkli objeler mi
//        System.out.println(object1==object2); //farkli objeler referanslari farkli

        SingletonObject object3= SingletonObject.getInstance();
        SingletonObject object4= SingletonObject.getInstance();
        //ayni mi
        System.out.println(object3==object4);

        System.out.println("----------object3 message--------------");
        System.out.println(object3.message);//Merhaba
        object3.changeMessage();
        System.out.println(object3.message);//Merhaba Design Pattern

        System.out.println("----------object4 message--------------");
        System.out.println(object4.message);//Merhaba Design Pattern

        //SingletonObject object5= new SingletonObject(); yeni obje olusturulamamasi gerekiyor
        //bu nedenle defaultt consu public degil private yapiyorum ki cons cagrilarak obje uretilemesin

    }
}
