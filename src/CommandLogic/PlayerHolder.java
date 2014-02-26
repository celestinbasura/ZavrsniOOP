/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandLogic;

import java.util.ArrayList;

/**
 *
 * @author Celestin
 */
public class PlayerHolder {

    ArrayList<Player> playerList = new ArrayList<Player>();

    
    public String getIdWithName(String name){
        String ID = null;
          for(int i = 0;i < playerList.size(); i++) {
            
            if(playerList.get(i).getName().equals(name)) {
                ID = playerList.get(i).getID();
            }
          }
          return "No player found";
    }
    public void addPlayer(String name, String ID){
       
        
        playerList.add(new Player(name, ID));
       
    }
    public String removePlayer(String nameOrID){
        String ID = null;
        
        for(int i = 0;i < playerList.size(); i++) {
            
            if(playerList.get(i).getName().equals(nameOrID)
              || playerList.get(i).getID().equals(nameOrID)){
                ID = playerList.get(i).getID();
                
                //ServerCommandRetriever.unregisterPlayer(ID);
            }
        }
        return ServerCommandRetriever.unregisterPlayer(ID);
    }
    
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < playerList.size(); i++) {

            sb.append(playerList.get(i).toString());
        }
        String helper = sb.toString();
        return helper;
    }
}
