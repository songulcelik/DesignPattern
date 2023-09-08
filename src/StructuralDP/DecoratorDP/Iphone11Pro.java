package StructuralDP.DecoratorDP;

public class Iphone11Pro extends PhoneDecorator{
    public Iphone11Pro(Iphone basicPhone) {
        super(basicPhone);
    }
    public String getModel(){
        return "11 pro";
    }
    public void roundConner(){
        System.out.println("corners are rounded");
    }
}
