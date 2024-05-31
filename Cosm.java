import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cosm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cosm extends YellowIdle
{
    /**
     * Act - do whatever the Cosm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeys();
        applyGravity();
        checkPlatformCollision();
        checkForRevertItem();// Add your action code here.
    }
    private void checkForRevertItem() {
        Actor revertItem = getOneObjectAtOffset(0, 0, RevertItem.class);
        if (revertItem != null) {
            World world = getWorld();
            int x = getX();
            int y = getY();
            world.removeObject(this);
            world.addObject(new YellowIdle(), x, y);  // Revertir a la clase original
            world.removeObject(revertItem);
        }
    }
}
