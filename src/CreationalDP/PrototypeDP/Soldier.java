package CreationalDP.PrototypeDP;

public class Soldier implements Cloneable{
    private int health;
    private int maxLifeTime;
    private int power;
    private String weapon;
    private boolean isAvailable;

    //param cons
    public Soldier(int health, int maxLifeTime, int power, String weapon, boolean isAvailable) {
        this.health = health;
        this.maxLifeTime = maxLifeTime;
        this.power = power;
        this.weapon = weapon;
        this.isAvailable = isAvailable;
    }
    public void printInfo(){
        System.out.println("yasam suresi : "+ this.maxLifeTime);
        System.out.println("saglik : "+ this.health);
        System.out.println("silah : "+ this.weapon);
        System.out.println("guc : "+ this.power);
        if (isAvailable){
            System.out.println("asker savasmak icin hazir");
        } else {
            System.out.println("bu asker savasamaz");
        }
    }

    @Override
    public Soldier clone() {
        try {
            Soldier cloneSoldier = (Soldier) super.clone();
            return cloneSoldier;
        } catch (CloneNotSupportedException e) {
            System.out.println("asker kopyalanirken hata olustu");
            e.printStackTrace();
        }
        return null;
    }
    //getter setter

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxLifeTime() {
        return maxLifeTime;
    }

    public void setMaxLifeTime(int maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
