package krbrave.pokemon.init;

import java.util.ArrayList;
import java.util.List;

import krbrave.pokemon.objects.blocks.BlockBase;
import krbrave.pokemon.objects.blocks.BlockPokemonFence;
import krbrave.pokemon.objects.blocks.BlockPokemonHouseCorner;
import krbrave.pokemon.objects.blocks.BlockPokemonWall;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block POKEMON_PATH = new BlockBase("pokemon_path", Material.GROUND).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static final Block POKEMON_PATH_WITH_GRASS = new BlockBase("pokemon_path_with_grass", Material.GROUND).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static final Block POKEMON_PATH_WITH_FOUR_GRASS = new BlockBase("pokemon_path_with_four_grass", Material.GROUND).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static final Block POKEMON_GRASS = new BlockBase("pokemon_grass", Material.GRASS).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static final Block POKEMON_GRASS_TOP_FLOWER = new BlockBase("pokemon_grass_top_flower", Material.GRASS).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static final Block POKEMON_GRASS_BOTTOM_FLOWER = new BlockBase("pokemon_grass_bottom_flower", Material.GRASS).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static final Block POKEMON_WATER = new BlockBase("pokemon_water", Material.GROUND).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static final Block POKEMON_WATER_CORNER = new BlockBase("pokemon_water_corner", Material.GROUND).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static final Block POKEMON_WATER_CORNER_TWO = new BlockBase("pokemon_water_corner_two", Material.GROUND).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static final Block POKEMON_WATER_SIDE = new BlockBase("pokemon_water_side", Material.GROUND).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static final Block POKEMON_WATER_SIDE_TWO = new BlockBase("pokemon_water_side_two", Material.GROUND).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static final Block POKEMON_WATER_SIDE_THREE = new BlockBase("pokemon_water_side_three", Material.GROUND).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static final Block POKEMON_WALL = new BlockPokemonWall("pokemon_wall").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static final Block POKEMON_FENCE = new BlockPokemonFence("pokemon_fence").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static final Block POKEMON_HOUSE_CORNER = new BlockPokemonHouseCorner("pokemon_house_corner").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
}
