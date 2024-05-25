import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public MyWorld() {    
        super(800, 800, 1); // Tamaño del mundo (ancho, alto, tamaño de celda)
        setBackgroundImageCentered("fondo.jpeg");
        prepare();
    }

    private void setBackgroundImageCentered(String filename) {
        // Cargar la imagen de fondo
        GreenfootImage backgroundImage = new GreenfootImage(filename);

        int worldWidth = getWidth();
        int worldHeight = getHeight();
        int imageWidth = backgroundImage.getWidth();
        int imageHeight = backgroundImage.getHeight();

        // Crear una nueva imagen del tamaño del mundo
        GreenfootImage worldImage = new GreenfootImage(worldWidth, worldHeight);

        // Calcular el recorte necesario para centrar la imagen
        int xOffset = (imageWidth - worldWidth) / 2;
        int yOffset = (imageHeight - worldHeight) / 2;

        // Dibujar solo la parte visible de la imagen en el centro del mundo
        worldImage.drawImage(backgroundImage, -xOffset, -yOffset);

        // Establecer la nueva imagen como fondo del mundo
        setBackground(worldImage);
    }
        
    private void prepare() {
        // Crear y agregar el jugador al mundo
        red player = new red();
        addObject(player, 100, 200);

        // Crear y agregar plataformas al mundo

        PlatformC platformC = new PlatformC();
        addObject(platformC,687,477);
        platformC.setLocation(697,471);
        PlatformL platformL = new PlatformL();
        addObject(platformL,460,732);
        platformL.setLocation(494,777);
        PlatformH platformH = new PlatformH();
        addObject(platformH,692,709);
        platformH.setLocation(694,707);
        removeObject(platformH);
        PlatformC platformC2 = new PlatformC();
        addObject(platformC2,707,669);
        platformC2.setLocation(678,512);
        removeObject(platformC2);
        PlatformB platformB = new PlatformB();
        addObject(platformB,79,564);
        platformB.setLocation(400,641);
        PlatformB platformB2 = new PlatformB();
        addObject(platformB2,508,643);
        platformB2.setLocation(529,643);
        PlatformB platformB3 = new PlatformB();
        addObject(platformB3,591,475);
        platformB3.setLocation(592,473);

        platformC2.setLocation(73,566);
        removeObject(platformC2);
        PlatformA platformA = new PlatformA();
        addObject(platformA,96,568);
        platformA.setLocation(100,558);
        PlatformA platformA2 = new PlatformA();
        addObject(platformA2,23,559);
        platformA.setLocation(31,556);
        PlatformA platformA3 = new PlatformA();
        addObject(platformA3,225,722);
        platformA3.setLocation(235,721);
        PlatformA platformA4 = new PlatformA();
        addObject(platformA4,751,663);
        platformA4.setLocation(730,660);
        PlatformA platformA5 = new PlatformA();
        addObject(platformA5,686,567);
        platformA5.setLocation(631,559);
        platformA5.setLocation(739,556);
        PlatformA platformA6 = new PlatformA();
        addObject(platformA6,739,556);
        platformA5.setLocation(740,559);
        PlatformA platformA7 = new PlatformA();
        addObject(platformA7,738,182);
        platformA7.setLocation(733,178);
        PlatformA platformA8 = new PlatformA();
        addObject(platformA8,156,497);
        platformA8.setLocation(50,417);
        PlatformA platformA9 = new PlatformA();
        addObject(platformA9,429,525);
        platformA9.setLocation(488,516);
        platformA9.setLocation(432,515);
        PlatformA platformA10 = new PlatformA();
        addObject(platformA10,432,515);
        platformA9.setLocation(465,520);
        PlatformA platformA11 = new PlatformA();
        addObject(platformA11,150,493);
        platformA11.setLocation(161,495);
        PlatformA platformA12 = new PlatformA();
        addObject(platformA12,258,497);
        platformA12.setLocation(236,497);
        PlatformA platformA13 = new PlatformA();
        addObject(platformA13,294,521);
        platformA13.setLocation(300,516);
        PlatformA platformA14 = new PlatformA();
        addObject(platformA14,235,497);
        platformA12.setLocation(267,505);
        PlatformA platformA15 = new PlatformA();
        addObject(platformA15,12,177);
        platformA15.setLocation(1,187);
        removeObject(platformA15);
        addObject(platformC2,20,180);
        removeObject(platformC2);
        PlatformB platformB4 = new PlatformB();
        addObject(platformB4,56,171);
        platformB4.setLocation(-1,176);
        PlatformB platformB5 = new PlatformB();
        addObject(platformB5,86,202);
        platformB5.setLocation(61,194);
        PlatformB platformB6 = new PlatformB();
        addObject(platformB6,151,566);
        platformB6.setLocation(118,557);
        platformA12.setLocation(295,505);
        platformA13.setLocation(303,515);
        platformA9.setLocation(489,538);
        platformA10.setLocation(469,516);
        platformA9.setLocation(482,538);
        removeObject(platformA9);
        platformC.setLocation(703,469);
        platformA10.setLocation(447,520);
        platformC.setLocation(530,512);
        PlatformC platformC3 = new PlatformC();
        addObject(platformC3,690,477);
        platformC3.setLocation(695,472);
        PlatformB platformB7 = new PlatformB();
        addObject(platformB7,637,561);
        platformB7.setLocation(640,557);
        platformA4.setLocation(715,660);
        platformB2.setLocation(512,642);
        platformL.setLocation(394,777);
        platformB4.setLocation(19,176);
        platformB4.setLocation(27,180);
        platformA10.setLocation(425,516);
        platformC.setLocation(539,513);
        platformA10.setLocation(460,514);
        platformA13.setLocation(274,516);
        platformA13.setLocation(264,525);
        platformA12.setLocation(253,507);
        platformA13.setLocation(269,516);
        platformA4.setLocation(695,659);
        removeObject(platformA4);
        PlatformC platformC4 = new PlatformC();
        addObject(platformC4,693,663);
        removeObject(platformC4);
        PlatformB platformB8 = new PlatformB();
        addObject(platformB8,711,661);
        platformB8.setLocation(757,660);
        PlatformB platformB9 = new PlatformB();
        addObject(platformB9,690,661);
        platformB9.setLocation(699,659);
        removeObject(platformB9);
        PlatformH platformH2 = new PlatformH();
        addObject(platformH2,676,661);
        platformH2.setLocation(670,711);
        platformL.setLocation(575,775);
        platformC4.setLocation(705,658);
        platformH2.setLocation(668,681);
        removeObject(platformH2);
        PlatformC platformC5 = new PlatformC();
        addObject(platformC5,680,662);
        platformC5.setLocation(678,657);
        platformC5.setLocation(674,653);
        removeObject(platformC5);
        platformB8.setLocation(766,658);
        PlatformB platformB10 = new PlatformB();
        addObject(platformB10,704,623);
        platformB10.setLocation(687,656);
        platformB10.setLocation(686,655);
    }
}
