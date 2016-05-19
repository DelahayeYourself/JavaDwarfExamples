package com.rts.starcraft.units.terran.heros;

import com.rts.starcraft.units.terran.Marine;

/**
 *
 * @author sam
 */
public final class Raynor extends Marine {

    private static volatile Raynor instance = null;

    private Raynor() {
        super("James Raynor", 120);
    }
    
    public static Raynor getInstance(){
        
        if(null == instance){
            instance = new Raynor();
            /*instance.setHp(120);
            instance.setName("Jim raynor");*/
        }
        
        return instance;
    }

    public void sayHoura(){
        System.out.println("Hourra !!");
    }
}
