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
public class Akatsuki {
    private String name, status, ring;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRing() {
        return ring;
    }

    public void setRing(String ring) {
        this.ring = ring;
    }
    
    
    public void tampilData(){
        System.out.println("Name : " + name);
        System.out.println("Status : " + status);
        System.out.println("Ring : " + ring);
    }
}
