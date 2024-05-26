import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class red here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class red extends Actor
{
    
    private int velocityY = -1;
    private int acceleration = 1;
    private int jumpStrength = -20;
    private boolean onGround = false;
    /**
     * Act - do whatever the red wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        checkKeys();
        applyGravity();
        checkPlatformCollision();
    }
    private void checkKeys() {
        if (Greenfoot.isKeyDown("up") && onGround) {
            jump();
        }
            if (Greenfoot.isKeyDown("left")) {
            checkSideCollision(-5);
                move(-5);

        }
        if (Greenfoot.isKeyDown("right")) {
            checkSideCollision(5);
            move(5);
        }


    }

    public void applyGravity() {
        if (!onGround && acceleration<1); {
            setLocation(getX(), getY() + velocityY);
            velocityY += acceleration;
            
        }
    }

    public void jump() {
        velocityY = -14;
        onGround = false;
    }

    public void checkPlatformCollision() {
        Actor platformBelow = getOneObjectAtOffset(0, getImage().getHeight() / 2 +1 , platform.class);
        if (platformBelow != null) {
            velocityY = 0;
            onGround = true;
            setLocation(getX(), platformBelow.getY() - getImage().getHeight() / 2);
        } else {
            onGround = false;
    
        }
        
    }
    private void checkSideCollision(int dx) {    
        Actor platformSide = getOneObjectAtOffset(dx, 0, platform.class);
        if (platformSide != null) {
            if (dx < 0) {
                setLocation(platformSide.getX() + platformSide.getImage().getWidth() / 2 + getImage().getWidth() / 2, getY());
            } else if (dx > 0) {
                setLocation(platformSide.getX() - platformSide.getImage().getWidth() / 2 - getImage().getWidth() / 2, getY());
            }
            
        }
        }}
        

