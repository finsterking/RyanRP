
package net.mcreator.aotkplugin.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.aotkplugin.item.ItemCardBack;
import net.mcreator.aotkplugin.ElementsAotkpluginMod;

@ElementsAotkpluginMod.ModElement.Tag
public class TabCards extends ElementsAotkpluginMod.ModElement {
	public TabCards(ElementsAotkpluginMod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabcards") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemCardBack.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
