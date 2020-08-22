package com.ninni.twigs.blocks;

import javax.annotation.Nullable;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

public class PebblesBlock extends BushBlock implements IWaterLoggable {
    public static final IntegerProperty PEBBLES = BlockStateProperties.PICKLES_1_4;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape ONE_SHAPE = Block.makeCuboidShape(2, 0, 2, 14, 2, 15);
    protected static final VoxelShape TWO_SHAPE = Block.makeCuboidShape(2, 0, 2, 14, 2, 15);
    protected static final VoxelShape THREE_SHAPE = Block.makeCuboidShape(0, 0, 0, 15, 3, 15);
    protected static final VoxelShape FOUR_SHAPE = Block.makeCuboidShape(0, 0, 0, 15, 3, 15);

    public PebblesBlock(AbstractBlock.Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(PEBBLES, Integer.valueOf(1)).with(WATERLOGGED, Boolean.valueOf(true)));
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockState blockstate = context.getWorld().getBlockState(context.getPos());
        if (blockstate.isIn(this)) {
            return blockstate.with(PEBBLES, Integer.valueOf(Math.min(4, blockstate.get(PEBBLES) + 1)));
        } else {
            FluidState fluidstate = context.getWorld().getFluidState(context.getPos());
            boolean flag = fluidstate.getFluid() == Fluids.WATER;
            return super.getStateForPlacement(context).with(WATERLOGGED, Boolean.valueOf(flag));
        }
    }

    public static boolean isInBadEnvironment(BlockState p_204901_0_) {
        return !p_204901_0_.get(WATERLOGGED);
    }

    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return !state.getCollisionShape(worldIn, pos).project(Direction.UP).isEmpty() || state.isSolidSide(worldIn, pos, Direction.UP);
    }

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        BlockPos blockpos = pos.down();
        return this.isValidGround(worldIn.getBlockState(blockpos), worldIn, blockpos);
    }

    /**
     * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
     * returns its solidified counterpart.
     * Note that this method should ideally consider only the specific face passed in.
     */
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (!stateIn.isValidPosition(worldIn, currentPos)) {
            return Blocks.AIR.getDefaultState();
        } else {
            if (stateIn.get(WATERLOGGED)) {
                worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
            }

            return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
        }
    }

    public boolean isReplaceable(BlockState state, BlockItemUseContext useContext) {
        return useContext.getItem().getItem() == this.asItem() && state.get(PEBBLES) < 4 ? true : super.isReplaceable(state, useContext);
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(PEBBLES)) {
            case 1:
            default:
                return ONE_SHAPE;
            case 2:
                return TWO_SHAPE;
            case 3:
                return THREE_SHAPE;
            case 4:
                return FOUR_SHAPE;
        }
    }

    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(PEBBLES, WATERLOGGED);
    }
}
