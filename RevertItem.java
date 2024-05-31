import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RevertItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RevertItem extends Actor
{
    private int lifetime = 600;  // 600 acts assuming 60 acts per second (10 seconds)

    public RevertItem() {
        GreenfootImage image = new GreenfootImage(20, 20);
    }

    public void act() {
        lifetime--;
        if (lifetime <= 0) {
            getWorld().removeObject(this);
    }
    }
}
