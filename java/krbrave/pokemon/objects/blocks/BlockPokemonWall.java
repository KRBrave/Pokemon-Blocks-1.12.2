package krbrave.pokemon.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockPokemonWall extends BlockBase
{
	
	public static final AxisAlignedBB POKEMON_WALL_AABB = new AxisAlignedBB(0.0625, 0, 0.125, 0.875, 1.5, 0.9375);

	public BlockPokemonWall(String name)
	{
		super(name, Material.ROCK);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return POKEMON_WALL_AABB;
	}
}
