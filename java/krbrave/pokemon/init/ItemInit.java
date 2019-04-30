package krbrave.pokemon.init;

import java.util.ArrayList;
import java.util.List;

import krbrave.pokemon.objects.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemInit 
{
	public static final List<Item> ITEMS= new ArrayList<Item>();
	
	public static final Item POKEBALL = new ItemBase("pokeball").setCreativeTab(CreativeTabs.MISC);
	public static final Item GREAT_BALL = new ItemBase("great_ball").setCreativeTab(CreativeTabs.MISC);
	public static final Item ULTRA_BALL = new ItemBase("ultra_ball").setCreativeTab(CreativeTabs.MISC);
	public static final Item MASTER_BALL = new ItemBase("master_ball").setCreativeTab(CreativeTabs.MISC);
	public static final Item SAFARI_BALL = new ItemBase("safari_ball").setCreativeTab(CreativeTabs.MISC);
	public static final Item POTION = new ItemBase("potion").setCreativeTab(CreativeTabs.MISC);
	public static final Item BURN_HEAL = new ItemBase("burn_heal").setCreativeTab(CreativeTabs.MISC);
	public static final Item ANTIDOTE = new ItemBase("antidote").setCreativeTab(CreativeTabs.MISC);
	public static final Item AWAKENING = new ItemBase("awakening").setCreativeTab(CreativeTabs.MISC);
	public static final Item PARALYZE_HEAL = new ItemBase("paralyze_heal").setCreativeTab(CreativeTabs.MISC);
	public static final Item ICE_HEAL = new ItemBase("ice_heal").setCreativeTab(CreativeTabs.MISC);
	public static final Item FULL_HEAL = new ItemBase("full_heal").setCreativeTab(CreativeTabs.MISC);
}
