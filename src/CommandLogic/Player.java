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
class Player {

    String playerName = null;
    String playerID = null;

    Player(String name, String ID) {
        if (name != null && ID != null) {
            playerName = name;
            playerID = ID;
        } else {
            playerName = "defualt";
            playerID = "default";
        }
    }

    void setName(String name) {

        playerName = name;
    }

    void setID(String ID) {

        playerID = ID;
    }

    String getName() {
        return playerName;
    }

    String getID() {
        return playerID;
    }
    
    @Override
    public String toString(){
        
        return playerName + ": " + playerID;
    }
}
