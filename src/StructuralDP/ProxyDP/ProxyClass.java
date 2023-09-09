package StructuralDP.ProxyDP;

public class ProxyClass implements ImageGenerator{

    private ReelClass reelClass;
    public String fullpath;

    public ProxyClass(String fullpath) {
        this.fullpath = fullpath;
    }

    @Override
    public void showImage() {
        if (reelClass==null){//burada yetkilendirme de yapilabilir
            this.reelClass=new ReelClass(fullpath);
        }

        reelClass.showImage();
    }
}
