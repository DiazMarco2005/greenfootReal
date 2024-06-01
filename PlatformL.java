import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlatformL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlatformL extends platform
{
    /**
     * Act - do whatever the PlatformL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PlatformL() {
        GreenfootImage image = new GreenfootImage("platn.jpg");
        image.scale(500, 10);// Asegúrate de tener una imagen llamada "platform.png" en la carpeta de imágenes
        setImage(image);
    }
    public void act()
    {
    
    }
}
