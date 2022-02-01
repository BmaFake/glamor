
package net.mcreator.pruebabma.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class GladiteItem extends Item {
	public GladiteItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.RARE));
		setRegistryName("gladite");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
