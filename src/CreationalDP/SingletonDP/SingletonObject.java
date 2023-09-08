package CreationalDP.SingletonDP;

public class SingletonObject {
    public String message="Merhaba";

    private SingletonObject() {
    }

    private static SingletonObject instance;
    public static SingletonObject getInstance(){
        if (instance==null){ //bu method ilk kez cagrildiginda yeni bir obje uretilir,sonrasinda ise ayni obje dondurulur
            instance=new SingletonObject();
        }
        return instance;
    }

    public void changeMessage(){
        this.message+=" Design Pattern";
    }

}
