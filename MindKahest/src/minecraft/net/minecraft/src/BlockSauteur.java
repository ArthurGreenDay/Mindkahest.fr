package net.minecraft.src;
 
import java.util.Random;
 
public class BlockSauteur extends Block
{
 
    protected BlockSauteur(int i, int j)
    {
        super(i, j, Material.wood); //a changer si vous le voulez
    }
 
    public void onEntityWalking(World world, int i, int j, int k, Entity entity)
    {
        entity.motionY += 3.0D; //remplacez x par la valeur de votre choix
    }
}