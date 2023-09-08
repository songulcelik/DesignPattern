package CreationalDP.FactoryDP.FactoryDP_test;

import CreationalDP.FactoryDP.Shape;
import CreationalDP.FactoryDP.ShapeFactory;
import CreationalDP.FactoryDP.ShapeType;

public class FactoryDPRunner {
    public static void main(String[] args) {

        Shape kare= ShapeFactory.getShape(ShapeType.KARE);
        kare.draw();

    }
}
