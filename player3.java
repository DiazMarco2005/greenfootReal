import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class red here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class player3 extends Actor
{
    
    protected int velocityY = -1;
    protected int acceleration = 1;
    protected int jumpStrength = -20;
    protected boolean onGround = false;

    protected String upKey = "G";
    protected String leftKey = "V";
    protected String rightKey = "N";


    public void act()
    {
        // Add your action code here.
        checkKeys2();
        applyGravity();
        checkPlatformCollision();
        CreateCos();

    }
    public void checkKeys2() {
        if (Greenfoot.isKeyDown(upKey) && onGround) {
            jump();
            
        }
            if (Greenfoot.isKeyDown(leftKey)) {
            checkSideCollision(-1);
                move(-20);

        }
        if (Greenfoot.isKeyDown(rightKey)) {
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
        } else {
            onGround = false;
    
        }
        
    }
    public void checkSideCollision(int dx) {    
        Actor platformSide = getOneObjectAtOffset(dx, 0, platform.class);
        if (platformSide != null) {
            if (dx < 0) {
                setLocation(platformSide.getX() + platformSide.getImage().getWidth() / 2 + getImage().getWidth() / 2, getY());
            } else if (dx > 0) {
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
            world.addObject(new YellowCosm(), x, y); 
            ((MyWorld)world).incrementCosmCounter();
            ((MyWorld)world).updateCosmCounterDisplay(); // Incrementar el contador en MyWorld

        }
        }
    }
