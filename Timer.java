import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Timer extends Actor {
    private int timeRemaining; // Time remaining in seconds

    public Timer(int minutes, int seconds) {
        this.timeRemaining = minutes * 60 + seconds;
        updateImage();
    }

    public void act() {
        if (timeRemaining > 0) {
            timeRemaining--;
            updateImage();
            if (timeRemaining == 0) {
                // Time's up, check the condition for winning
                ((MyWorld)getWorld()).checkGameOver();
            }
            Greenfoot.delay(60); // Delay for 1 second
        }
    }

    private void updateImage() {
        int minutes = timeRemaining / 60;
        int seconds = timeRemaining % 60;
        setImage(new GreenfootImage(String.format("%02d:%02d", minutes, seconds), 24, Color.WHITE, Color.BLACK));
    }

    public int getTimeRemaining() {
        return timeRemaining;
    }
}
