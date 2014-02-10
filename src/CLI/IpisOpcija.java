/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CLI;

import java.util.Scanner;

/**
 *
 * @author Celestin
 */
public class IpisOpcija {
    private static String opcija1 = "Registracija novoga igraca ";
    private static String opcija2 = "Preuzmi zadatak";
    private static String opcija3 = "Predaj rijesenje";
    private static String opcija4 = "Deregistracija postojeceg korisnika";
    
    public static int getSelectedOption(){
        int selectedOption = 0;
        System.out.println(opcija1
                + "\n" + opcija2 
                + "\n" + opcija3
                + "\n" + opcija4 
                + "\n");
        Scanner sc = new Scanner (System.in);
        selectedOption = sc.nextInt();
        return selectedOption;
    }
    
}
