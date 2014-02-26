/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandLogic;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Celestin
 */
public class ServerCommandRetriever {

    static String cmd = "?command=";
    static String serverLocation = "http://localhost/";
   
            

    static public String registerPlayer(String name) throws MalformedURLException, IOException {

        String newCommand = "register&player=";
        String fullURL = serverLocation + cmd + newCommand + name;
        URL url = new URL(fullURL);
        InputStream in = new BufferedInputStream(url.openStream());
        Scanner sc2 = new Scanner(in);
         String helper;
        helper = sc2.nextLine();
        return helper.substring(helper.lastIndexOf("ID=") + 3);
       // return sc2.nextLine();
    }
    
    static public String makeNewGame(String ID) throws MalformedURLException, IOException{
        
        String newCommand = "new&ID=";
        String fullURL = serverLocation + cmd + newCommand + ID;
        URL url = new URL(fullURL);
        InputStream in = new BufferedInputStream(url.openStream());
        Scanner sc2 = new Scanner(in);
        String helper;
        helper = sc2.nextLine();
        return helper.substring(helper.lastIndexOf("ID=") + 3);
        //return sc2.nextLine();   
    }
      
    static public String checkSolution(String solution, String ID) throws MalformedURLException, IOException{
        
        String newCommand = "check&solution=";
        
        String addedCommand = "&ID=";
        
        String fullURL = serverLocation + cmd + newCommand + solution + addedCommand + ID;
        URL url = new URL(fullURL);
        InputStream in = new BufferedInputStream(url.openStream());
        Scanner sc2 = new Scanner(in);
        return sc2.nextLine();
       // return serverLocation + cmd + newCommand + solution + addedCommand + ID;
    }
    
     static public String unregisterPlayer(String ID){
         
        String newCommand = "unregister&ID=";
        
         try {
            
            
            String fullURL = serverLocation + cmd + newCommand + ID;
            URL url = new URL(fullURL);
            InputStream in = new BufferedInputStream(url.openStream());
            Scanner sc2 = new Scanner(in);
            return sc2.nextLine();
            
        } 
        
        
        catch (MalformedURLException ex) {
            Logger.getLogger(ServerCommandRetriever.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ServerCommandRetriever.class.getName()).log(Level.SEVERE, null, ex);
        }
        return serverLocation + cmd + newCommand  + ID;
    }
     
     

 
}
