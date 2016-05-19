package com.rts.starcraft.units;

import com.rts.starcraft.units.exceptions.DeadException;
import com.rts.starcraft.units.exceptions.OverHealthException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author sam
 */
public class Unit {

    protected static ArrayList<String> quotes = new ArrayList();
    protected static Random randomGenerator = new Random();

    private String name;
    private int hp;
    private int hp_max;

    public Unit(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.hp_max = hp;
    }

    @Override
    public String toString() {
        return String.format("%s : %s", this.name, this.hp);
    }

    public String talk() {
        //return this.quotes.get(randomGenerator.nextInt(this.quotes.size()));
        return this.quotes.get(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) throws DeadException, OverHealthException {
        
        if(hp <= 0){
            this.hp = 0;
            throw new DeadException();
        }
        
        if(hp > this.hp_max){
            this.hp = hp_max;
            throw new OverHealthException();
        }
        
        this.hp = hp;
    }

    public int getHp_max() {
        return hp_max;
    }

    public void setHp_max(int hp_max) {
        this.hp_max = hp_max;
    }

}
