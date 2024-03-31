
package net.mcreator.aotkplugin.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.aotkplugin.creativetab.TabCards;
import net.mcreator.aotkplugin.ElementsAotkpluginMod;

@ElementsAotkpluginMod.ModElement.Tag
public class ItemCrystalClearWingSynchroDragon extends ElementsAotkpluginMod.ModElement {
	@GameRegistry.ObjectHolder("aotkplugin:crystal_clear_wing_synchro_dragon")
	public static final Item block = null;
	public ItemCrystalClearWingSynchroDragon(ElementsAotkpluginMod instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("aotkplugin:crystal_clear_wing_synchro_dragon", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("crystal_clear_wing_synchro_dragon");
			setRegistryName("crystal_clear_wing_synchro_dragon");
			setCreativeTab(TabCards.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
