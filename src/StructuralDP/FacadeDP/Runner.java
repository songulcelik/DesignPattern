package StructuralDP.FacadeDP;

public class Runner {
    public static void main(String[] args) {
        String text= "Design Pattern";
        AES_Enc aesEnc=new AES_Enc();
        aesEnc.encrypt(text);

        SHA_Enc shaEnc=new SHA_Enc();
        shaEnc.encrypt(text,"techpro");

        MD5_Enc md5Enc=new MD5_Enc();
        md5Enc.encrypt(text,"techpro", true);

        //karmasik yapiyi classda kullanmak kotu bir kullanim. bunun yerine;

        //--------------------------------------
        //bir arayuz olsa sadece kullanmak istedigimiz algoritmyai secerek
        //bu algoritmanin encrypt methodunun detayi veya gereklilikleri ile ilgilenmeden
        //sifreleme yapabilsek daha guzel olur


        System.out.println("--------------FacadeDP--------------");
        EncryptorFacade encryptor= new EncryptorFacade();
        encryptor.encrypt(text,EncrypotType.AES);
        encryptor.encrypt(text,EncrypotType.SHA);
        encryptor.encrypt(text,EncrypotType.MD5);



    }
}
