package com.feed_the_beast.mods.ftbchunks.client.map.color;

import com.feed_the_beast.mods.ftbguilibrary.icon.Color4I;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;

/**
 * @author LatvianModder
 */
public class CustomBlockColor implements BlockColor {
	public final Color4I color;

	public CustomBlockColor(Color4I c) {
		color = c.withAlpha(255);
	}

	@Override
	public Color4I getBlockColor(BlockAndTintGetter world, BlockPos pos) {
		return color;
	}
}
