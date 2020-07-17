/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguro;

import javax.swing.*;

/**
 *
 * @author SebastianR
 */
public class Seguro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        String MARCA;
        int ANIO;
        int CUOTAFINAL;
        String [] ALTAGAMA = {"AUDI","VOLVO","MERCEDESBENZ","PORSCHE","FERRARI"};
        
        
        MARCA = JOptionPane.showInputDialog(null ,"Ingrese la marca del vehiculo", "Seguros Rodriguez",JOptionPane.WARNING_MESSAGE );
     
        
        ANIO = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año del vehiculo", "Seguros Rodriguez",JOptionPane.WARNING_MESSAGE));
               
        boolean GAMA = BUSCARGAMA(ALTAGAMA , MARCA);
        
        if (GAMA){
        CUOTAFINAL = 5000;
        
                 }else{
                    CUOTAFINAL = 900;
                      }
        
        
       int CUOTAANIO = BUSCARANIO(ANIO);
       CUOTAFINAL = CUOTAFINAL + CUOTAANIO;

       JOptionPane.showMessageDialog(null ,"El valor de su cuota es: $" + CUOTAFINAL , "Seguros Rodriguez",JOptionPane.INFORMATION_MESSAGE );
    }
    
    public static boolean BUSCARGAMA (String [] ALTAGAMA , String MARCA){
    
                   
     for( String  MARCA2 : ALTAGAMA){
      if( MARCA2.equals(MARCA)){
            return true;
                                }              
                        }
            return false;
    }
    

    public static int BUSCARANIO( int ANIO ){

       int cuota; 
        
       if(ANIO>=1990 && ANIO <=1999 ){
       cuota = 1300; 
        }else
       if(ANIO>=2000 && ANIO <=2010){
        cuota=1500;
        } else
       if(ANIO>=2011 && ANIO <=2016){
        cuota=2500;
        } else
       if(ANIO>=2017 && ANIO <=2020){
        cuota=4000;
        } else
        cuota=1200;
        
return cuota;
             }

 
     }