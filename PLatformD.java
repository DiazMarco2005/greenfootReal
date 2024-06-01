import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PLatformD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PLatformD extends platform
{
    /**
     * Act - do whatever the PLatformD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PLatformD() {
        GreenfootImage image = new GreenfootImage("platn.jpg");
        image.scale(195, 18);// Asegúrate de tener una imagen llamada "platform.png" en la carpeta de imágenes
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
    }
}
