/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan60.akatsuki;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Amegakure ame1,ame2;
        ame1 = new Amegakure();
        System.out.println("=======Akatsuki=======");
        ame1.setName("Pain");
        ame1.setStatus("Deceased");
        ame1.setRing("Zero");
        ame1.tampilData();
        System.out.println("");
        ame2 = new Amegakure();
        ame2.setName("Konan");
        ame2.setStatus("Deceased");
        ame2.setRing("White");
        ame2.tampilData();
        System.out.println("");
        Konoha knh1,knh2,knh3;
        knh1 = new Konoha();
        knh2 = new Konoha();
        knh3 = new Konoha();
        knh1.setName("Itachi");
        knh2.setName("Obito");
        knh3.setName("Orochimaru");
        knh1.setStatus("Deceased");
        knh2.setStatus("Deceased");
        knh3.setStatus("Alive");
        knh1.setRing("Red Blood");
        knh2.setRing("Pearl");
        knh3.setRing("Sky");
        knh1.setPostHomeland("Konoha");
        knh2.setPostHomeland("Konoha");
        knh3.setPostHomeland("Otogakure");
        knh1.tampilData();
        System.out.println("");
        knh2.tampilData();
        System.out.println("");
        knh3.tampilData();
        System.out.println("");
        
    }
    
}
