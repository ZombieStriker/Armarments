package me.zombie_striker.armaments.items;

import me.zombie_striker.harmony.custom.CustomItem;

public class GunArmament {

    private CustomItem base;

    public GunArmament(CustomItem base){
        this.base = base;
    }

    public CustomItem getBase() {
        return base;
    }
}
