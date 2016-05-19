package com.rts.starcraft.units.terran;

import com.rts.starcraft.units.interfaces.Cloackable;
import com.rts.starcraft.units.Unit;

/**
 *
 * @author sam
 */
public class Ghost extends Unit implements Cloackable {

    private boolean cloack = false;

    static {
        quotes.add("Blabla");
    }

    public Ghost() {
        super("Ghost", 75);
    }

    @Override
    public boolean isCloacked() {
        return this.cloack;
    }

    @Override
    public void toggleCloack() {
        this.cloack = !this.cloack;
    }
}
