/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandLogic;



/**
 *
 * @author Celestin
 */
public class ServerCommandRetriever {

    static String cmd = "?command=";
    static String serverLocation = "http://localhost/";

    static public String registerPlayer(String name) {

        String newCommand = "register&player=";
       
        return serverLocation + cmd + newCommand + name;
    }
    
    static public String MakeNewGame(String ID){
        
        String newCommand = "new&ID=";
       
        return serverLocation + cmd + newCommand + ID;    
    }
      
    static public String CheckSolution(String solution, String ID){
        
        String newCommand = "check&solution=";
        
        String addedCommand = "&ID=";
       
        return serverLocation + cmd + newCommand + solution + addedCommand + ID;
    }
    
     static public String UnregisterPlayer(String ID){
        
        String newCommand = "unregister&ID=";
       
        return serverLocation + cmd + newCommand + newCommand + ID;
    }
}
