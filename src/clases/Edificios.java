/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author chent
 */
public class Edificios {
    private String Campus;//I...V
     private String Area;//Administrativo, Salones, Baños, Kiosko
     private boolean energiaelectrica;
     private double mts2;

    public Edificios() {
    }

    public Edificios(String Campus, String Area, boolean energiaelectrica, double mts2) {
        this.Campus = Campus;
        this.Area = Area;
        this.energiaelectrica = energiaelectrica;
        this.mts2 = mts2;
    }

    public String getCampus() {
        return Campus;
        
    }

    public void setCampus(String Campus) {
        this.Campus = Campus;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public boolean isEnergiaelectrica() {
        return energiaelectrica;
    }

    public void setEnergiaelectrica(boolean energiaelectrica) {
        this.energiaelectrica = energiaelectrica;
    }

    public double getMts2() {
        return mts2;
    }

    public void setMts2(double mts2) {
        this.mts2 = mts2;
    }

    @Override
    public String toString() {
        return "Edificios{" + "Campus=" + Campus + ", Area=" + Area + ", energiaelectrica=" + energiaelectrica + ", mts2=" + mts2 + '}';
    }
     
    
}
