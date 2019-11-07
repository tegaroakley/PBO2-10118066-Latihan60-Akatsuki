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
public class Amegakure extends Akatsuki{
    private String homeland;

    public String getHomeland() {
        return homeland;
    }

    public void setHomeland(String homeland) {
        this.homeland = homeland;
    }

    @Override
    public void tampilData() {
        super.tampilData(); //To change body of generated methods, choose Tools | Templates.
        setHomeland("Amegakure");
        System.out.println("Homeland : " + getHomeland());
    }
    
    
    
}
