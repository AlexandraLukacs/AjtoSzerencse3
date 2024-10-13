/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3_door_luck_game;

import java.util.Random;

/**
 *
 * @author LukácsAlexandra(SZF_
 */
public class DoorLuck {
    private int csere;
    private int nemCsere;
    private int round;
    private int carPosition; 
    
    public DoorLuck(int csere, int nemCsere, int round){
        this.csere=0;
        this.nemCsere=0;
        this.round=0;
        randomizeCarPosition();
    }
   
    private void randomizeCarPosition() {
        Random rand = new Random();
        carPosition = rand.nextInt(3) + 1;
    }
    
    public boolean switchDoor(int chosenDoor) {
        round++;
        if (chosenDoor != carPosition) {
            csere++;
            return true;
        } else {
            return false;
        }
    }

    public boolean stayDoor(int chosenDoor) {
        round++;
        if (chosenDoor == carPosition) {
            nemCsere++; 
            return true;
        } else {
            return false;
        }
    }

    public int getCsereWins() {
        return csere;
    }

    

    public int getNemCsereWins() {
        return nemCsere;
    }

    public int getRounds() {
        return round;
    }

    public void resetGame() {
        randomizeCarPosition();
    }

}
