package BehaivoralDP.ChainOfResponsibilityDP;

public class GenelMudur extends Approver{
    public GenelMudur() {
        super(null);
    }

    @Override
    boolean approveLoan(int amount) {//limit sinirsiz
        System.out.println("genel mudur talebi onayladi");
        System.out.println("******************************");
        return false;
    }
}
