package com.ka10k.umapyoidelight.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CarrotHamburgDeluxeBlock extends Block
{
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    protected static final VoxelShape PLATE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 1.0D, 15.0D);
    protected static final VoxelShape MEAL = Block.box(3.0D, 1.0D, 3.0D, 13.0D, 10.0D, 13.0D);
    protected static final VoxelShape SHAPE = Shapes.or(PLATE, MEAL);

    public CarrotHamburgDeluxeBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection());
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
}
