package protocolsupport.server.container;

import net.minecraft.server.v1_8_R2.BlockPosition;
import net.minecraft.server.v1_8_R2.EntityHuman;
import net.minecraft.server.v1_8_R2.ICrafting;
import net.minecraft.server.v1_8_R2.PlayerInventory;
import net.minecraft.server.v1_8_R2.World;

public class ContainerAnvil extends net.minecraft.server.v1_8_R2.ContainerAnvil {

	public ContainerAnvil(final PlayerInventory playerinventory, final World world, final BlockPosition blockposition, final EntityHuman entityhuman) {
		super(playerinventory, world, blockposition, entityhuman);
	}

	@Override
	public void b() {
		super.b();
		for (ICrafting listener : this.listeners) {
			listener.setContainerData(this, 0, this.a);
		}
	}

}