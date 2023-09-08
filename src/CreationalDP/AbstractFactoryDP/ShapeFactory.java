package CreationalDP.AbstractFactoryDP;

public class ShapeFactory implements AbstractFactory<Shape>{
    @Override
    public Shape getObject(String objectType) {
    return getShape(objectType);
}
    public static Shape getShape(String  type){

        if (type.equalsIgnoreCase("Ucgen")){
            return new Triangle("Ucgen", 60, 3);
        } else if (type.equalsIgnoreCase("Kare")) {
            return new Square("Kare",90,4);

        } else if (type.equalsIgnoreCase("Besgen")) {
            return new Pentagon("Besgen",108,5);
        }
        return null;
    }


}
