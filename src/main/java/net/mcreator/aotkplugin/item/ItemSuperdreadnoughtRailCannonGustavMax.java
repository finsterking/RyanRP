
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
public class ItemSuperdreadnoughtRailCannonGustavMax extends ElementsAotkpluginMod.ModElement {
	@GameRegistry.ObjectHolder("aotkplugin:superdreadnought_rail_cannon_gustav_max")
	public static final Item block = null;
	public ItemSuperdreadnoughtRailCannonGustavMax(ElementsAotkpluginMod instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0,
				new ModelResourceLocation("aotkplugin:superdreadnought_rail_cannon_gustav_max", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("superdreadnought_rail_cannon_gustav_max");
			setRegistryName("superdreadnought_rail_cannon_gustav_max");
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
