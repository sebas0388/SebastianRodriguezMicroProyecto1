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
     
        String Brand;
        int YEAR;
        int FinalFee;
        String [] HighEnd = {"AUDI","VOLVO","MERCEDESBENZ","PORSCHE","FERRARI","ALFAROMEO"};
        
        
        Brand = JOptionPane.showInputDialog(null ,"Ingrese la marca del vehiculo", "Seguros Rodriguez",JOptionPane.WARNING_MESSAGE ).toUpperCase();
     
        
        YEAR = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año del vehiculo", "Seguros Rodriguez",JOptionPane.WARNING_MESSAGE));
               
        boolean GAMA = SEARCH(HighEnd , Brand);
        
        if (GAMA){
        FinalFee = 5000;
        
                 }else{
                    FinalFee = 900;
                      }
        
        
       int YearFee = BUSCARANIO(YEAR);
       FinalFee = FinalFee + YearFee;

       JOptionPane.showMessageDialog(null ,"El valor de su cuota es: $" + FinalFee , "Seguros Rodriguez",JOptionPane.INFORMATION_MESSAGE );
    }
    
    public static boolean SEARCH (String [] Array , String Nombre ){
    
                   
     for( String  N : Array){
      if( N.equals(Nombre)){
            return true;
                                }              
                        }
            return false;
    }
    

    public static int BUSCARANIO( int Y ){

       int Valor; 
        
       if(Y>=1990 && Y<=1999 ){
       Valor = 1300; 
        }else
       if(Y>=2000 && Y<=2010){
        Valor=1500;
        } else
       if(Y>=2011 && Y<=2016){
        Valor=2500;
        } else
       if(Y>=2017 && Y<=2020){
        Valor=4000;
        } else
        Valor=1200;
        
return Valor;
             }

 
     }