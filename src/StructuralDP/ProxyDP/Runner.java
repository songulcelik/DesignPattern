package StructuralDP.ProxyDP;

public class Runner {
    public static void main(String[] args) {

        ReelClass reelObject= new ReelClass("C://image1.jpg");//resim yukleniyor.. uygulama yuksek performans harcadi
        System.out.println(reelObject.name);
        reelObject.changeFormat();//ben buna herkes erissin istemiyorum bunun icin proxy olustururuz

        System.out.println("-----------proxy------------");
        //otherMethod(ImageGenerator object);
        //bu methoda dogrudan reelObject verirsek henuz objenin kendisine ihtiyacimiz olmadigi halde
        //gereksiz yere zaman performans bellek vs kullanmis oluruz. ımage yuklenmis olur
        //bunuhn yerine proxyObj kullanarak imagenin yuklenmesini/ gercek objenin uretilmesni geciktirerek
        //performansi artirabliriz

        ProxyClass proxyObject= new ProxyClass("C://image1.jpg");//resim yuklenmedi. orjinal obje degil
        //proxyObject.name? name gelmedi gercek obje henuz olusturulmadi

        proxyObject.showImage();//gercek objenin methodu cagrildiginda artik reel object olustu

        //gercek objeye kisitlama
       // proxyObject.chaneFormat //diger methodlara erisim yok. yani orjinal objenin yonetimini saglamis olduk



    }
}
