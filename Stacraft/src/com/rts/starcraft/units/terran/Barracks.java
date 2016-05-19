package com.rts.starcraft.units.terran;

import com.rts.starcraft.units.Unit;

/**
 *
 * @author sam
 */
public class Barracks <T extends Unit>{
    
    public T train(Class<T> unitClass) throws InstantiationException, IllegalAccessException{
        return unitClass.newInstance();
    }
    
}
