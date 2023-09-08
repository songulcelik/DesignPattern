package CreationalDP.PrototypeDP;

public class Runner {
    public static void main(String[] args) {
        Soldier soldierAvailabled=new Soldier(100,20,60,"kilic",true);//80 asker
        Soldier soldierNotAvailabled=new Soldier(100,20,60,"kilic",false);
        Soldier soldierWeapon=new Soldier(100,20,60,"ok",true);

        //bunun yerine bir tane askeri prorip alsak yani klonlasak sadece farkli ozellikleri set etsek
        //implements Cloneable yaptik

        //soldierAvailabled objemiz prototip olsun
        Soldier soldier4= soldierAvailabled.clone();
        System.out.println("-------prorotip");
        soldierAvailabled.printInfo();
        System.out.println("--------clone soldier");
        soldier4.printInfo();
        System.out.println("--------clone soldierNotAvailable");
        Soldier soldier5=soldierAvailabled.clone();
        soldier5.setAvailable(false);
        soldier5.printInfo();




    }
}
