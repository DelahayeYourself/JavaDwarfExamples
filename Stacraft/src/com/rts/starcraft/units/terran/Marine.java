package com.rts.starcraft.units.terran;

import com.rts.starcraft.units.Unit;

/**
 *
 * @author sam
 */
public class Marine extends Unit {

    static {
        quotes.add("Gogogo !!");
    }

    public Marine() {
        super("Marine", 50);
    }

    public Marine(String name, int hp) {
        super(name, hp);
    }

}
