/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan60.akatsuki;

/**
 *
 * @author PC
 */
public class Konoha extends Akatsuki{
    private String preHomeland, postHomeland; 

    public String getPreHomeland() {
        return preHomeland;
    }

    public void setPreHomeland(String preHomeland) {
        this.preHomeland = preHomeland;
    }

    public String getPostHomeland() {
        return postHomeland;
    }

    public void setPostHomeland(String postHomeland) {
        this.postHomeland = postHomeland;
    }

    @Override
    public void tampilData() {
        super.tampilData(); //To change body of generated methods, choose Tools | Templates.
        setPreHomeland("Konoha");
        System.out.println("Homeland Before: " + getPreHomeland());
        System.out.println("Homeland Now   : " + getPostHomeland());
    }
    
}
