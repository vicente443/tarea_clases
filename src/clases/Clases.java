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
public class Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personas humanos = new Personas("Alumno","Vicente",19,'M',"GOC030HCCNHCA5");
        System.out.println(humanos.toString());
        Edificios escuela=new Edificios("I","Salones",true,90);
      System.out.println(escuela.toString());
    }

}
