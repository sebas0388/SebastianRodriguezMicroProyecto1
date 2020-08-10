/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguro;

import javax.swing.*;

/**
 * @author SebastianR
 */
public class Seguro {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    String Brand;
    int Year;
    int FinalFee;
    String [] HighEnd = {"AUDI","VOLVO","MERCEDESBENZ","PORSCHE","FERRARI","ALFAROMEO"};
          
    boolean log = LOGIN();
    
    if (log){
        
        Brand = JOptionPane.showInputDialog(null ,"Ingrese la marca del vehiculo", "Seguros Rodriguez",JOptionPane.WARNING_MESSAGE ).toUpperCase();
             
        Year = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año del vehiculo", "Seguros Rodriguez",JOptionPane.WARNING_MESSAGE));
               
        boolean Gama = SEARCH(HighEnd , Brand);
        
        if (Gama){
        FinalFee = 5000;
        
                 }else{
                    FinalFee = 900;
                      }
                
       int YearFee = BUSCARANIO(Year);
       FinalFee = FinalFee + YearFee;

       JOptionPane.showMessageDialog(null ,"El valor de su cuota es: $" + FinalFee , "Seguros Rodriguez",JOptionPane.INFORMATION_MESSAGE );
       
    }else {
        
             JOptionPane.showMessageDialog(null ,"USUARIO BLOQUEADO" , "Seguros Rodriguez",JOptionPane.INFORMATION_MESSAGE );
       }
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
    
    public static boolean LOGIN (){
    
      JPanel myPanel = new JPanel();    
      JTextField User = new JTextField(15);
      JTextField Password = new JPasswordField(15);
   
      myPanel.add(new JLabel("Usurio:"));
      myPanel.add(User);
          
      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
      
      myPanel.add(new JLabel("Contraseña:"));
      myPanel.add(Password);
    
      String [] baseUser = {"JUANB","CARLOSZ"};
      String [] basePass = {"JB.123456","CZ.123456"};
      int attempts = 1;    
      boolean flag = false;  
      
        do{
           JOptionPane.showConfirmDialog(null, myPanel ,"Ingrese usuario y contraseña", JOptionPane.OK_CANCEL_OPTION);
         
      flag = TWOSEARCH ( baseUser , basePass , User , Password );
            
          if (flag){
      
          JOptionPane.showMessageDialog(null ,"BIENVENIDO" , "Seguros Rodriguez",JOptionPane.INFORMATION_MESSAGE );
      
                }else{
      
          JOptionPane.showMessageDialog(null ,"USUARIO O CONTRASEÑA INVALIDOS" , "Seguros Rodriguez",JOptionPane.INFORMATION_MESSAGE );
     
      attempts ++;
                 }
          
             }while (attempts <= 3 && (!flag));
         
              return flag;
     }
    
    public static boolean TWOSEARCH (String [] arrayA, String [] arrayB, JTextField nombreA, JTextField nombreB   ){
                       
     for( String  N : arrayA){
        for( String  M : arrayB){
         if( N.equals(nombreA.getText() ) && M.equals(nombreB.getText()) ){
             
            return true;
                                    }
                                  }   
                                } 
            return false;
      }
          }