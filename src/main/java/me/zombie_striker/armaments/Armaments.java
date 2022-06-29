package me.zombie_striker.armaments;

import java.io.InputStream;

public class Armaments {

    private static Armaments inst;
    private final ArmamentsPlugin plugin;

    public static Armaments getInstance() {
        return inst;
    }
    protected Armaments(ArmamentsPlugin plugin){
        this.plugin = plugin;
        inst = this;
    }

    public InputStream getJarFileInputStream(String path){
        return Armaments.class.getResourceAsStream(path);
    }
}
