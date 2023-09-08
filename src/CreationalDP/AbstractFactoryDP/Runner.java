package CreationalDP.AbstractFactoryDP;

public class Runner {
    public static void main(String[] args) {

        AbstractFactory<Shape> shapeFactory= FactoryProducer.getFactory("sekil");
        Shape kare= shapeFactory.getObject("kare");
        kare.draw();
        AbstractFactory <Color> colorFactory=FactoryProducer.getFactory("renk");
        Color mavi= colorFactory.getObject("mavi");
        mavi.fill();

        System.out.println("--------------");
        Shape ucgen= (Shape) FactoryProducer.getFactory("sekil").getObject("ucgen");
        ucgen.draw();
        Color kirmizi= (Color) FactoryProducer.getFactory("renk").getObject("kirmizi");
        kirmizi.fill();





    }
}
