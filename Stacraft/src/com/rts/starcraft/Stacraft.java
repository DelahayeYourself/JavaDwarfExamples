package com.rts.starcraft;

import com.rts.starcraft.units.exceptions.DeadException;
import com.rts.starcraft.units.exceptions.OverHealthException;
import com.rts.starcraft.units.terran.Barracks;
import com.rts.starcraft.units.terran.Ghost;
import com.rts.starcraft.units.terran.Marine;
import com.rts.starcraft.units.terran.heros.Raynor;

/**
 *
 * @author sam
 */
public class Stacraft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, DeadException, OverHealthException {
        Barracks barracks = new Barracks();
        Marine marine = (Marine) barracks.train(Marine.class); // au lieu de new Marine();
        Ghost ghost = (Ghost) barracks.train(Ghost.class); // au lieu de new Ghost();

        Raynor jim = Raynor.getInstance();

        System.out.println(marine);
        //System.out.println(ghost);

        try {
            marine.setHp(12);
            ghost.setHp(500000000);
        } catch (DeadException | OverHealthException ex) {
            System.out.println(ex.getClass());
        }
        //System.out.println(jim);
        /*System.out.println(ghost.talk());
        ghost.toggleCloack();
        System.out.println(String.format("Ghost cloacked: %s", ghost.isCloacked()));
        ghost.toggleCloack();
        System.out.println(String.format("Ghost cloacked: %s", ghost.isCloacked()));*/

        //System.out.println(jim);

        /*System.out.println(ghost.talk());
        ghost.toggleCloack();
        System.out.println(String.format("Ghost cloacked: %s", ghost.isCloacked()));
        ghost.toggleCloack();
        System.out.println(String.format("Ghost cloacked: %s", ghost.isCloacked()));*/
    }

}
