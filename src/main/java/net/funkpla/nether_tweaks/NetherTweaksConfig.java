package net.funkpla.nether_tweaks;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

import java.util.ArrayList;
import java.util.List;

@Config(name = "nether_tweaks")
public class NetherTweaksConfig implements ConfigData {
    @ConfigEntry.Category("Fortress")
    @ConfigEntry.BoundedDiscrete(min = -100, max = 100)
    public int fortressOffset = 48;
    @ConfigEntry.Category("Portal")
    public boolean allowOnceLit;
    @ConfigEntry.Category("Portal")
    public List<String> portalStructures = new ArrayList<>();
}