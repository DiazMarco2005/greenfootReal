import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlatformH here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlatformH extends platform
{
    /**
     * Act - do whatever the PlatformH wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PlatformH() {
        GreenfootImage image = new GreenfootImage("platn.jpg");
        image.scale(100, 10);// Asegúrate de tener una imagen llamada "platform.png" en la carpeta de imágenes
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
    }
}
