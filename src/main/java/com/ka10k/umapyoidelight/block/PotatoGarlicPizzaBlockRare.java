package com.ka10k.umapyoidelight.block;

import com.google.common.base.Suppliers;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import vectorwing.farmersdelight.common.block.FeastBlock;

import java.util.List;
import java.util.function.Supplier;

public class PotatoGarlicPizzaBlockRare extends FeastBlock
{
    public static final IntegerProperty SLICE_SERVINGS = IntegerProperty.create("servings", 0, 6);

    protected static final VoxelShape PLATE_SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 1.0D, 15.0D);
    protected static final VoxelShape FOOD_SHAPE = Shapes.joinUnoptimized(PLATE_SHAPE, Block.box(2.0D, 1.0D, 2.0D, 14.0D, 2.5D, 14.0D), BooleanOp.OR);

    public final Supplier<List<Item>> pizzaSliceServings = Suppliers.memoize(() -> List.of(
            ItemRegistration.POTATO_GARLIC_PIZZA_SLICE_RARE.get(),
            ItemRegistration.POTATO_GARLIC_PIZZA_SLICE_RARE.get(),
            ItemRegistration.POTATO_GARLIC_PIZZA_SLICE_RARE.get(),
            ItemRegistration.POTATO_GARLIC_PIZZA_SLICE_RARE.get(),
            ItemRegistration.POTATO_GARLIC_PIZZA_SLICE_RARE.get(),
            ItemRegistration.POTATO_GARLIC_PIZZA_SLICE_RARE.get())
    );

    public PotatoGarlicPizzaBlockRare(Properties properties) {
        super(properties, ItemRegistration.POTATO_GARLIC_PIZZA_SLICE_RARE, true, false);
    }

    @Override
    public IntegerProperty getServingsProperty() {
        return SLICE_SERVINGS;
    }

    @Override
    public int getMaxServings() {
        return 6;
    }

    @Override
    public ItemStack getServingItem(BlockState state) {
        return new ItemStack(pizzaSliceServings.get().get(state.getValue(getServingsProperty()) - 1));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return state.getValue(getServingsProperty()) == 0 ? PLATE_SHAPE : FOOD_SHAPE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, SLICE_SERVINGS);
    }
}
