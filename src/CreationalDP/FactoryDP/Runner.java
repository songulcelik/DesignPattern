package CreationalDP.FactoryDP;

public class Runner {
    public static void main(String[] args) {
      Shape triangle=  new Triangle("ucgen", 60, 3);
      triangle.draw();

      Shape square=new Square("kare",90,4);
      square.draw();


      Shape pentagon=new Pentagon("besgen",108,5);
      pentagon.draw();

      //objenin cons veya domain classi hakkinda bilgimiz olmadan objeyi burada kullanmak istiyoruz
        //bunun icin factory methıd disagn pattern kullanilmali

        System.out.println("-------------------------------------");
        Shape shape1= ShapeFactory.getShape(ShapeType.UCGEN);
        shape1.draw();

        Shape shape2=ShapeFactory.getShape(ShapeType.KARE);
        shape2.draw();

        //artik new keywordunu kullanmadigimiz icin classimiz Square/Triangle objelerine
        //siki sikiya bagimli degil

    }
}
