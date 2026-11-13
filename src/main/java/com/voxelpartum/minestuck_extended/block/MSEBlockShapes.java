package com.voxelpartum.minestuck_extended.block;

import com.mraof.minestuck.block.CustomVoxelShape;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Map;

public class MSEBlockShapes {

    public static final Map<Direction, VoxelShape> SKAIA_PC_SHAPE = new CustomVoxelShape(new double[]{1,0,1,15,14.7,7}, new double[]{2,0.05,7,14,13,13},new double[]{3,2,13,13,10,16}).createRotatedShapes();

}
