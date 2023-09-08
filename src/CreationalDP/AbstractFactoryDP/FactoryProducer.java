package CreationalDP.AbstractFactoryDP;
//fabrikalarin fabrikasi
public class FactoryProducer {
    public  static AbstractFactory getFactory(String select){
        if (select.equalsIgnoreCase("sekil")){
            return new  ShapeFactory();
        } else if (select.equalsIgnoreCase("renk")) {
            return new ColorFactory();
        }
        return null;
    }
}
