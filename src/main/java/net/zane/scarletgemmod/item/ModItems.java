package net.zane.scarletgemmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;
import net.zane.scarletgemmod.ScarletGemMod;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SCARLET_GEM = registerItem("scarlet_gem",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ScarletGemMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ScarletGemMod.LOGGER.debug("Registering Mod Items for " + ScarletGemMod.MOD_ID);

    }
}
