package krbrave.pokemon.objects.blocks;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockPokemonHouseCorner extends BlockBase {
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	public static final AxisAlignedBB POKEMON_HOUSE_CORNER_AABB_NORTH = new AxisAlignedBB(0.25, 0, 0, 1, 1, 0.75);
	public static final AxisAlignedBB POKEMON_HOUSE_CORNER_AABB_EAST = new AxisAlignedBB(0.25, 0, 0.25, 1, 1, 1);
	public static final AxisAlignedBB POKEMON_HOUSE_CORNER_AABB_SOUTH = new AxisAlignedBB(0, 0, 0.25, 0.75, 1, 1);
	public static final AxisAlignedBB POKEMON_HOUSE_CORNER_AABB_WEST = new AxisAlignedBB(0, 0, 0, 0.75, 1, 0.75);

	public BlockPokemonHouseCorner(String name)
	{
		super(name, Material.ROCK);
	}
	
	protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, FACING);
    }
	
	public IBlockState withRotation(IBlockState state, Rotation rot)
	    {
	        return state.withProperty(FACING, rot.rotate(state.getValue(FACING)));
	    }
	
	public IBlockState withMirror(IBlockState state, Mirror mirrorIn)
    {
        return state.withRotation(mirrorIn.toRotation(state.getValue(FACING)));
    }
	
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing());
    }
	
	public int getMetaFromState(IBlockState state)
    {
        int i = 0;
        i = i | state.getValue(FACING).getHorizontalIndex();
        return i;
    }
	
	public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
    }

    public EnumPushReaction getMobilityFlag(IBlockState state)
    {
        return EnumPushReaction.PUSH_ONLY;
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
		switch (state.getValue(FACING)) {
			case NORTH: return POKEMON_HOUSE_CORNER_AABB_NORTH;
			case EAST: return POKEMON_HOUSE_CORNER_AABB_EAST;
			case SOUTH: return POKEMON_HOUSE_CORNER_AABB_SOUTH;
			case WEST: return POKEMON_HOUSE_CORNER_AABB_WEST;
			default: return POKEMON_HOUSE_CORNER_AABB_NORTH;
		}
	}
	
	public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
    {
        return BlockFaceShape.UNDEFINED;
    }
	
}
