package com.rts.starcraft.units.exceptions;

/**
 *
 * @author sam
 */
public class OverHealthException extends Exception{
    
    public OverHealthException(){
        System.out.println("This unit has enough health point.");
    }
    
}
