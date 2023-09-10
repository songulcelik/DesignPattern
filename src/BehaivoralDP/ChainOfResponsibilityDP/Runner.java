package BehaivoralDP.ChainOfResponsibilityDP;

public class Runner {
    public static void main(String[] args) {
        Approver genelMudur= new GenelMudur();
        Approver mudur=new Mudur(genelMudur);
        Approver memur=new Memur(mudur);

        System.out.println("kredi onaylama limitleri:");
        System.out.println("Memur max: 5000");
        System.out.println("Mudur max: 10000");
        System.out.println("Genel mudur: limit yok");
        System.out.println("---------------------");

        System.out.println("musterinin memurdan talep ettigi miktar: 1000");
        memur.approveLoan(1000);

        System.out.println("musterinin memurdan talep ettigi miktar: 7000");
        memur.approveLoan(7000);

        System.out.println("musterinin memurdan talep ettigi miktar:17000");
        memur.approveLoan(17000);

        //dp kullanmasaydik tek tek objelerimize talepte  bulunmus olcaktik
        memur.approveLoan(17000);
        mudur.approveLoan(17000);
        genelMudur.approveLoan(17000);

    }
}
