package CreationalDP.AbstractFactoryDP;

/*public*/ class Triangle implements Shape {
    private String name;
    private int angle;
    private int edge;

    public Triangle(String name, int angle, int edge) {
        this.name = name;
        this.angle = angle;
        this.edge = edge;
    }
    public void  draw(){
        System.out.println(this.name+" cizildi. Aci : "+ this.angle+ " Kenar : "+ this.edge);
    }
}
