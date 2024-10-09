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
    private door[] doors;
    
    public DoorLuck(){
        
    }
    
    public void ajtok(){
        doors = new door[3];
        for (int i = 0; i < 3; i++) {
            doors[i] = new door("Ajtó " + (i + 1));
            doors[i].addActionListener(this);
        }
    }
    
    public void random(){
        
    }
}
