package com.rts.starcraft.units.exceptions;

/**
 *
 * @author sam
 */
public class DeadException extends Exception{
    
    public DeadException(){
        System.out.println("This unit has died !");
    }
    
}
