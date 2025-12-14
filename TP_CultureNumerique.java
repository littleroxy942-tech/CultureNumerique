/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_culturenumerique;
import java.util.Scanner;

/**
 *
 * @author roxan
 */
public class TP_CultureNumerique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Quel est votre nom ?");
        
        String username = myObj.nextLine();
        System.out.println("Bonjour " + username);
    }
}
    

