/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author Admin
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      int i = (int) (Math.random()* 5 + 1);
      String a = "Test";
      
      if (i== 6.0){
           a = "The Dragon has been slain!";
      } else if(i== 1){
           a = "Congrats, you're dead.";
      }else{
        a = "Nice try, but no.";
          
      }
      System.out.println(a);
      }

    }
    

