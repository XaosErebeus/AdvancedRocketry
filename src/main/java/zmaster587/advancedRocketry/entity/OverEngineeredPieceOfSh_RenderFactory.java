package zmaster587.advancedRocketry.entity;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import zmaster587.advancedRocketry.client.render.RendererRocket;

public class OverEngineeredPieceOfSh_RenderFactory implements IRenderFactory<Entity> {

	@Override
	public Render<? super Entity> createRenderFor(RenderManager manager) {
		return new RendererRocket(manager);
	}

}
