package net.minecraft.src;

public class BlockVitreColo extends BlockBreakable {

public BlockVitreColo(int par1, int par2, Material par3Material, boolean par4)
{
super(par1, par2, par3Material, par4);
}

public boolean isOpaqueCube()
{
return false;
}

public int getRenderBlockPass()
{
return 1;
}

public boolean renderAsNormalBlock()
{
return false;
}

}