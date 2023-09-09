package StructuralDP.ProxyDP;

public class ReelClass implements ImageGenerator{
    public String fullpath;
    public String name;

    public ReelClass(String fullpath) {
        this.fullpath = fullpath;
        this.name="resim";
        loadImage();
        //obje olusturuldugunda db den image yuklensin
    }

    @Override
    public void showImage() {
        System.out.println(this.name+ " gosteriliyor.. path: "+ this.fullpath);
    }

    public void loadImage(){
        System.out.println("resim yukleniyor..");
    }

    //extra diger methodlar
    public void changeFormat(){
        //burada bagimli diger objeler kullaniliyor
    }//her class buna ulasamasin vs


}
