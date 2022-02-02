
package net.mcreator.pruebabma.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.pruebabma.init.PruebaBmaModTabs;

public abstract class DarkmorItem extends ArmorItem {
	public DarkmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 37;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 5, 6, 6}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 18;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "darkmor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends DarkmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(PruebaBmaModTabs.TAB_BMOD));
			setRegistryName("darkmor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "prueba_bma:textures/models/armor/gladmor_layer_1.png";
		}
	}

	public static class Chestplate extends DarkmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(PruebaBmaModTabs.TAB_BMOD));
			setRegistryName("darkmor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "prueba_bma:textures/models/armor/gladmor_layer_1.png";
		}
	}

	public static class Leggings extends DarkmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(PruebaBmaModTabs.TAB_BMOD));
			setRegistryName("darkmor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "prueba_bma:textures/models/armor/gladmor_layer_2.png";
		}
	}

	public static class Boots extends DarkmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(PruebaBmaModTabs.TAB_BMOD));
			setRegistryName("darkmor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "prueba_bma:textures/models/armor/gladmor_layer_1.png";
		}
	}
}
