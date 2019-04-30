package krbrave.pokemon.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockPokemonFence extends BlockBase
{
	public static final AxisAlignedBB POKEMON_FENCE_AABB = new AxisAlignedBB(0.0625, 0, 0.6875, 0.9375, 1.5, 0.3125);

	public BlockPokemonFence(String name)
	{
		super(name, Material.WOOD);
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
		return POKEMON_FENCE_AABB;
	}
	
}
