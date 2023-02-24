/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_14_alcance_2;

/**
 *
 * @author invitado
 */
public class EVA1_14_ALCANCE_2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    int x=100;//visible dentro de todo el bloque main
    
    for (int i = 0; i < 10; i++) {
      int x=100;//ya declarada
      int y=423//visible solo dentro del bloque
      
      if(i==5){
        
      }
    }
    
    int y=222;//hasta aqui el ciclo for ni el if no existe asi que si se puede volver a declarar
  }
  
}
