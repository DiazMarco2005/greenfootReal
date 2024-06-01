import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FixedGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class platform2 extends platform
{
    /**
     * Act - do whatever the FixedGround wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
        public platform2(int width, int height) {
            GreenfootImage image = new GreenfootImage(width, height);
            image.setColor(Color.GREEN);
            image.fillRect(100, 0, width, height);
            setImage(image);
            

    }
}
