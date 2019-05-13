/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado.logica;

/**
 *
 * @author Estudiantes
 */
public class Cliente {
    
    public void LanzarDados() {
            
        Dado d = new Dado();
        Dado d1 = new Dado();
        
        int n2=0, n3=0, n4=0, n5=0, n6=0, n7=0, n8=0, n9=0, n10=0, n11=0, n12=0;
        
        for (int i=0; i<1000; i++) {
           
        int numero = ((d.numero()) + (d1.numero()));    
            
            if ((numero)==2) {
                n2++;
            }
            
            if ((numero)==3) {
                n3++;
            }
            
            if ((numero)==4) {
               n4++;
            }
            
            if ((numero)==5) {
               n5++;
            }
            
            if ((numero)==6) {
               n6++;
            }
            
            if ((numero)==7) {
               n7++;
            }
            
            if ((numero)==8) {
               n8++;
            }
            
            if ((numero)==9) {
               n9++;
            }
            
            if ((numero)==10) {
               n10++;
            }
            
            if ((numero)==11) {
               n11++;
            }
            
            if ((numero)==12) {
               n12++;
            }
            
        }
        
            System.out.println("Frecuencia 2= " + n2);
            System.out.println("Frecuencia 3= " + n3);
            System.out.println("Frecuencia 4= " + n4);
            System.out.println("Frecuencia 5= " + n5);
            System.out.println("Frecuencia 6= " + n6);
            System.out.println("Frecuencia 7= " + n7);
            System.out.println("Frecuencia 8= " + n8);
            System.out.println("Frecuencia 9= " + n9);
            System.out.println("Frecuencia 10= " + n10);
            System.out.println("Frecuencia 11= " + n11);
            System.out.println("Frecuencia 12= " + n12);
            
        }
    
}
