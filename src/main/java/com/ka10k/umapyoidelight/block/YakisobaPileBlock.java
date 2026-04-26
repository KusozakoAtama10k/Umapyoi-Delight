package com.ka10k.umapyoidelight.block;

import com.ka10k.umapyoidelight.item.ItemRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import vectorwing.farmersdelight.common.block.FeastBlock;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class YakisobaPileBlock extends FeastBlock
{
    public static final IntegerProperty YAKISOBA_SERVINGS = IntegerProperty.create("servings", 0, 8);

    protected static final VoxelShape FOOD_SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);

    public final List<Supplier<Item>> yakisobaServings = Arrays.asList(
            ItemRegistration.YAKISOBA,
            ItemRegistration.YAKISOBA,
            ItemRegistration.YAKISOBA,
            ItemRegistration.YAKISOBA,
            ItemRegistration.YAKISOBA,
            ItemRegistration.YAKISOBA,
            ItemRegistration.YAKISOBA,
            ItemRegistration.YAKISOBA
    );

    public YakisobaPileBlock(Properties properties) {
        super(properties, ItemRegistration.YAKISOBA, false);
    }

    @Override
    public IntegerProperty getServingsProperty() {
        return YAKISOBA_SERVINGS;
    }

    @Override
    public int getMaxServings() {
        return 8;
    }

    @Override
    public ItemStack getServingItem(BlockState state) {
        return new ItemStack(yakisobaServings.get(state.getValue(getServingsProperty()) - 1).get());
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return FOOD_SHAPE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, YAKISOBA_SERVINGS);
    }
}
