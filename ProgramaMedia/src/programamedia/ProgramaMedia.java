/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int nasc=sc.nextInt();
        int i =2024-nasc;
        if(i>18){
            System.out.println("maior");
        }else{
            System.out.println("menor");
        }
        
        
        }
    }
    

