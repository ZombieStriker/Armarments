package me.zombie_striker.armaments;

import me.zombie_striker.harmony.Harmony;
import me.zombie_striker.harmony.events.PrepareCustomItemLoadEvent;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ArmamentsListener implements Listener {

    private final ArmamentsPlugin plugin;
    public ArmamentsListener(ArmamentsPlugin armamentsPlugin) {
    this.plugin = armamentsPlugin;
    }

    @EventHandler
    public void onPrepareCustomItems(PrepareCustomItemLoadEvent event){
        Harmony.getInstance().getCustomItemManager().registerCustomItem(Material.RABBIT_FOOT,1,"ak47",Armaments.getInstance().getJarFileInputStream("resourcepack_models/ak47.json"));
        Harmony.getInstance().getCustomItemManager().registerCustomItem(Material.RABBIT_FOOT,2,"m16",Armaments.getInstance().getJarFileInputStream("resourcepack_models/m16.json"));
        Harmony.getInstance().getCustomItemManager().registerCustomItem(Material.RABBIT_FOOT,3,"remington870",Armaments.getInstance().getJarFileInputStream("resourcepack_models/remington870.json"));
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event){

    }
}
