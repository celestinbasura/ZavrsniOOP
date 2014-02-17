
import CLI.IpisOpcija;
import CommandLogic.ServerCommandRetriever;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

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

    public static void main(String[] args) throws MalformedURLException, IOException {
        int optionSelected = 0;
        Scanner sc = new Scanner(System.in);
        IpisOpcija ispisniObjekt = new IpisOpcija();
        System.out.println(ispisniObjekt.toString());
        if (sc.hasNextInt()) {
            optionSelected = sc.nextInt();
        }

        sc.nextLine();
        switch (optionSelected) {
            case 1:
                System.out.println("\nUnesite ime za registraciju: \n");
                System.out.println(ServerCommandRetriever.registerPlayer("Tomo"));
                URL url = new URL(ServerCommandRetriever.registerPlayer("Tomo"));
                InputStream in = new BufferedInputStream(url.openStream());
                Scanner sc2 = new Scanner(in);
                System.out.println(sc2.nextLine()); 
                

                break;

            case 2:
                System.out.println("\n Igra Vam je: \n");
                System.out.println(ServerCommandRetriever.makeNewGame("8457754432790416709"));

                break; //TODO : dodati object i metodu za dohvacanje igra slanjem ID-a

            case 3:
                System.out.println("\n Unesite Vase rijesenje: \n");
                
                System.out.println(ServerCommandRetriever.checkSolution("18489499648484", "18416816515"));
                break;//TODO : dodati object i metodu za slanje rijesenja igre slanjem ID-a

            case 4:
                System.out.println("\n Unesite ime koje zelite de-registirati: \n");
                System.out.println(ServerCommandRetriever.unregisterPlayer("18416816515"));
                break;// TODO metoda za dereg

            default:
                System.out.println("\n Odabrana opcija nije moguca, birajte ponovno");
                break;
        }
    }
}
