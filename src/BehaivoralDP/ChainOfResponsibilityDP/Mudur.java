package BehaivoralDP.ChainOfResponsibilityDP;

public class Mudur extends Approver{
    public Mudur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount<=10000){
            System.out.println("mudur talebi onayladi");
            System.out.println("**********************");
            return true;
        } else if (chief!=null) {
            System.out.println("miktar mudurun limitini asiyor, talep genel mudure e yonlendiriliyorsunuz");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
