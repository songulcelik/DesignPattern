package StructuralDP.CompositeDP;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        //tum calisanlari listele
        Finans finans=new Finans();
        Sales sales=new Sales();
        //yeni bir department olusturduk
        Arge arge=new Arge();

        List<String> allEmployees= new ArrayList<>();
        finans.getEmployees().forEach(t->allEmployees.add(t));
        sales.getEmployees().forEach(t->allEmployees.add(t));
        System.out.println(allEmployees);
        //yeni bir department olusturduk
        arge.getEmployees().forEach(t->allEmployees.add(t));

        //bu kotu yol. daha fazla department olsaydi

        System.out.println("----------composite dp------------");
        //tum calisanlari listele
        HeadDepartment head= new HeadDepartment();
        head.addDepartment(finans);
        head.addDepartment(sales);
        //yeni bir department olusturduk
        head.addDepartment(arge);

        System.out.println("tum depertmantler : " +head.getName());
        System.out.println("tum calisanlar : "+ head.getEmployees());


    }
}
