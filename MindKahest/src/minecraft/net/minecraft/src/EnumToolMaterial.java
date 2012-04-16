package net.minecraft.src;

public enum EnumToolMaterial
{
    WOOD(0, 59, 1.0F, 0, 15),
    STONE(1, 131, 2F, 1, 5),
    Etain(2 , 160, 3F, 2, 5),
    Cuivre(2 , 190, 4F, 2, 5),
    Laiton(2 , 220, 5F, 2, 5),
    IRON(2, 250, 6F, 2, 14),
    GOLD(0, 400, 7F, 2, 14),
    Mithril(2 , 800, 8F, 2, 14),
    EMERALD(3, 1000, 9F, 3, 10),
    Pierredesang(2 , 1500, 10F, 3, 10);
    


    /**
     * The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = IRON/GOLD)
     * Le niveau de matière de cet outil peut récolter (3 = DIAMOND, 2 = FER, 1 = PIERRE, 0 = FER / GOLD)
     */
    private final int harvestLevel;

    /**
     * The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32)
     * Le nombre de utilise ce matériau permet. (bois = 59, la pierre = 131, le fer = 250, diamant = 1561, or = 32)
     */
    private final int maxUses;

    /**
     * The strength of this tool material against blocks which it is effective against.
     * La force de ce matériau de l'outil contre les blocs dont il est efficace contre.
     * 
     */
    private final float efficiencyOnProperMaterial;

    /** Damage versus entities.
     * Les Dommages contre les entités
     */
    private final int damageVsEntity;

    /** Defines the natural enchantability factor of the material.
     * Defines the natural enchantability factor of the material
     *  */
    private final int enchantability;

    private EnumToolMaterial(int par3, int par4, float par5, int par6, int par7)
    {
        harvestLevel = par3;
        maxUses = par4;
        efficiencyOnProperMaterial = par5;
        damageVsEntity = par6;
        enchantability = par7;
    }

    /**
     * The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32)
     * Le nombre de utilise ce matériau permet. (bois = 59, la pierre = 131, le fer = 250, diamant = 1561, or = 32)
     */
    public int getMaxUses()
    {
        return maxUses;
    }

    /**
     * The strength of this tool material against blocks which it is effective against.
     * La force de ce matériau de l'outil contre les blocs dont il est efficace contre.
     */
    public float getEfficiencyOnProperMaterial()
    {
        return efficiencyOnProperMaterial;
    }

    /**
     * Damage versus entities.
     */
    public int getDamageVsEntity()
    {
        return damageVsEntity;
    }

    /**
     * The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = IRON/GOLD)
     */
    public int getHarvestLevel()
    {
        return harvestLevel;
    }

    /**
     * Return the natural enchantability factor of the material.
     */
    public int getEnchantability()
    {
        return enchantability;
    }
}
