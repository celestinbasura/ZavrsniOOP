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

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < playerList.size(); i++) {

            sb.append(playerList.get(i).toString());
        }
        String helper = sb.toString();
        return helper;
    }
    public void addPlayer(String name){
        
        
    }
}
