
package net.mcreator.pruebabma.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.pruebabma.init.PruebaBmaModTabs;

public class GladimiteswordItem extends Item {
	public GladimiteswordItem() {
		super(new Item.Properties().tab(PruebaBmaModTabs.TAB_BMOD).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("gladimitesword");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
