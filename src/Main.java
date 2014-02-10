
import CLI.IpisOpcija;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Celestin
 */
public class Main {
    public static void main(String[] args) {
        
        switch(IpisOpcija.getSelectedOption()){
            case 1: System.out.println("\nUnesite ime za registraciju: \n"); break;
            case 2: System.out.println("\n Igra Vam je: \n"); break; //TODO : dodati object i metodu za dohvacanje igra slanjem ID-a
            case 3: System.out.println("\n Unesite Vase rijesenje: \n"); break;//TODO : dodati object i metodu za slanje rijesenja igre slanjem ID-a
            case 4: System.out.println("\n Unesite ime koje zelite de-registirati: \n");break;// TODO metoda za dereg
            default: System.out.println("\n Odabrana opcija nije moguca, birajte ponovno"); break;   
        }
    }
}
