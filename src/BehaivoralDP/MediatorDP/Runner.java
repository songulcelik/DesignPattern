package BehaivoralDP.MediatorDP;

public class Runner {
    public static void main(String[] args) {
        //oncelikle arabulucu objeyi olusturalim
        MessageMediator mediator=new MessageMediator();

        //katilimcilari olusturalim
        Actor actor1= new Profesor("Prof. Math", mediator);
        Actor actor2= new Profesor("Prof. Chem", mediator);
        Actor actor3= new Profesor("Prof. IT", mediator);

        //katilimcilar uzamn  oldukalri konu ile kayit olmali
        mediator.register("Math",actor1);
        mediator.register("Chem",actor2);
        mediator.register("IT",actor3);

        //katilimcialr sorularini iletiyor
        System.out.println("prof. Math sorularini soruyor");
        actor1.sendMessage("Chem","Kimya nedir");
        actor1.sendMessage("IT","Yazilimci olmak keyifli mi?");

        System.out.println();
        System.out.println("prof. IT sorularini soruyor");
        actor3.sendMessage("Math", "Matematik gercek hayatta ne isimize yarar");


    }
}
