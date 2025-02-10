package net.funkpla.fortress_tweak;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.storage.DimensionDataStorage;
import org.jetbrains.annotations.NotNull;

public class PersistenceManager extends SavedData {
    public boolean netherPortalLit = false;
    public static String NETHER_PORTAL_LIT = "nether_portal_lit";

    @Override
    public @NotNull CompoundTag save(CompoundTag tag) {
        tag.putBoolean(NETHER_PORTAL_LIT, netherPortalLit);
        return tag;
    }

    public static PersistenceManager fromTag(CompoundTag tag) {
        PersistenceManager state = new PersistenceManager();
        state.netherPortalLit = tag.getBoolean(NETHER_PORTAL_LIT);
        return state;
    }

    public static PersistenceManager getServerState(MinecraftServer server) {
        DimensionDataStorage dimensionDataStorage = server.getLevel(Level.OVERWORLD).getDataStorage();
        return dimensionDataStorage.computeIfAbsent(
                PersistenceManager::fromTag,
                PersistenceManager::new,
                FortressTweakMod.MOD_ID);
    }
}
