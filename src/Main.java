
import CLI.IpisOpcija;
import CommandLogic.PlayerHolder;
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
        int optionSelected = 100;
        String name = null;
        String solution = null;
        Scanner sc = new Scanner(System.in);
        IpisOpcija ispisniObjekt = new IpisOpcija();
        PlayerHolder ph = new PlayerHolder();

        while (optionSelected != 0) {

            System.out.println(ispisniObjekt.toString());
            if (sc.hasNextInt()) {
                optionSelected = sc.nextInt();
            }
            sc.nextLine();
            switch (optionSelected) {
                case 1:
                    System.out.println("\nUnesite ime za registraciju: \n");
                    name = sc.nextLine();
                    ph.addPlayer(name, ServerCommandRetriever.registerPlayer(name));
                    //System.out.println(ServerCommandRetriever.registerPlayer(name));

                    break;

                case 2:
                    System.out.println("\n Unesite ime po kojem zelite igru: \n");

                    name = sc.nextLine();
                    //ph.getIdWithName(name);

                    System.out.println(ServerCommandRetriever.makeNewGame("8457754432790416709"));

                    break; //TODO : dodati object i metodu za dohvacanje igra slanjem ID-a

                case 3:
                    System.out.println("\n Unesite ime po kojem zelite predati rijesenje  \n");

                    name = sc.nextLine();

                    System.out.println("\n Unesite Vase rijesenje: \n");

                    solution = sc.nextLine();

                    System.out.println(ServerCommandRetriever.checkSolution(solution, name));
                    break;//TODO : dodati object i metodu za slanje rijesenja igre slanjem ID-a

                case 4:
                    System.out.println("\n Unesite ime koje zelite de-registirati: \n");
                    name = sc.nextLine();
                    System.out.println(ph.removePlayer(name));
                    //System.out.println(ServerCommandRetriever.unregisterPlayer(name));
                    break;// TODO metoda za dereg

                default:
                    System.out.println("\n Odabrana opcija nije moguca, birajte ponovno");
                    break;
            }
        }
    }

}
