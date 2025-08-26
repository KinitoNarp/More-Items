package kinitonarp.dev.items;

import net.minecraft.item.FoodComponent;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


// public class Macaron {
//    public static final FoodComponent MACARON = new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).build();
//}

public class Macaron {
    public static final Item CUSTOM_FOOD = registerItem("custom_food",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder()
                    .hunger(6)
                    .saturationModifier(0.6f)
                    .build())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier("not-enough-items", "macaron"), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for modid");
    }
}