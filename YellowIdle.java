import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class red here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class YellowIdle extends Actor
{
    
    private int velocityY = -1;
    private int acceleration = 1;
    private int jumpStrength = -23;
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
        checkSideCollision(0);
        CreateCos();
    }
    public void checkKeys() {
        if (Greenfoot.isKeyDown("w") && onGround) {
            jump();
        }
            if (Greenfoot.isKeyDown("a")) {
            checkSideCollision(-1);
                move(-20);

        }
        if (Greenfoot.isKeyDown("d")) {
            checkSideCollision(1);
            move(20);
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
        } 
        else {
            onGround = false;
    
        }
        Actor fixedGroundBelow = getOneObjectAtOffset(0, getImage().getHeight() / 2 + 1, platform2.class);
        if (fixedGroundBelow != null) {
            velocityY = 0;
            onGround = true;
            setLocation(getX(), fixedGroundBelow.getY() - getImage().getHeight() / 2);
        
        }
    }
    
    public void checkSideCollision(int dx) {    
        Actor platformSide = getOneObjectAtOffset(dx, 0, platform.class);
        if (platformSide != null) {
            if (dx < 0) {
                setLocation(platformSide.getX() + platformSide.getImage().getWidth() / 2 + getImage().getWidth() / 2, getY());
            } 
            else if (dx > 0) {
                setLocation(platformSide.getX() - platformSide.getImage().getWidth() / 2 - getImage().getWidth() / 2, getY());
            }
            
        }
        }
        
    public void CreateCos(){
        Actor Am;
        Am = getOneObjectAtOffset(0, 0, red.class);
        if (Am != null){
            World world = getWorld();
            int x = getX();
            int y = getY();
            world.removeObject(this);  // Eliminar el jugador amarillo
            world.addObject(new Cosm(), x, y);
            ((MyWorld)world).incrementCosmCounter();
            ((MyWorld)world).updateCosmCounterDisplay(); // Incrementar el contador en MyWorld

        }   
        }
    }
        
