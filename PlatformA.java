import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlatformA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlatformA extends platform
{
    /**
     * Act - do whatever the PlatformA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PlatformA() {
        GreenfootImage image = new GreenfootImage("platn.jpg");
        image.scale(135, 10);// Asegúrate de tener una imagen llamada "platform.png" en la carpeta de imágenes
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
    }
}
