package StructuralDP.DecoratorDP;

public class Iphone11 extends PhoneDecorator{
    public Iphone11(Iphone basicPhone) {
        super(basicPhone);
    }
    //Iphone11 ilkel Iphonenin tum islevlerine sahip
    //artik yeni islev eklicez

    public String getModel(){
        return "11";
    }

}
