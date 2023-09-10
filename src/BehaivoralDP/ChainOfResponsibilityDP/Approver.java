package BehaivoralDP.ChainOfResponsibilityDP;

public abstract class Approver {
    public Approver chief;

    public Approver(Approver chief) {
        this.chief = chief;
    }
    //oynaylanabilcek kredi limitine gore krediyi onaylarsa true aksai halde false donduren method
    abstract boolean approveLoan(int amount);

}
