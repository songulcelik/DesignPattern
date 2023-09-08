package StructuralDP.DecoratorDP;

public class Iphone11ProMax extends Iphone11Pro{
    public Iphone11ProMax(Iphone basicPhone) {
        super(basicPhone);
    }
    //iphone11in getModel() islevini degistirebilirz


    @Override
    public String getModel() {
        return super.getModel()+ "max";
    }

    //iphone11pronun islevlerine + olarak yeni islev
    public String addColor(){
        return "gold";
    }
}
