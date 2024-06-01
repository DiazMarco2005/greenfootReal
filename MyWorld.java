import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int spawnTimer = 0;
    private int spawnInterval = 600;  // 600 acts = 10 seconds
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
        addObject(player, 720, 700);

        YellowIdle yellowIdle = new YellowIdle();
        addObject(yellowIdle,83,359);
        addObject(new platform2(1000, 20), 300, 785);  // Suelo fijo

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
        platformA11.setLocation(100,494);
        platformA12.setLocation(258,503);
        platformA12.setLocation(288,510);
        platformA8.setLocation(72,414);
        platformB6.setLocation(132,552);
        platformA.setLocation(69,610);
        removeObject(platformA);
        platformA2.setLocation(81,555);
        platformA10.setLocation(474,509);
        platformB10.setLocation(712,652);
        platformB8.setLocation(751,650);
        platformL.setLocation(386,772);
        platformB.setLocation(418,636);
        platformL.setLocation(492,769);
        platformB2.setLocation(538,635);
        platformB.setLocation(422,636);
        platformB.setLocation(400,636);
        platformA5.setLocation(744,554);
        platformA5.setLocation(744,554);
        platformB7.setLocation(644,553);
        platformA5.setLocation(755,556);
        removeObject(platformA5);
        platformB7.setLocation(642,556);
        platformB2.setLocation(529,638);
        platformB2.setLocation(529,638);
        PlatformB platformB11 = new PlatformB();
        addObject(platformB11,472,569);
        platformB11.setLocation(460,719);
        PlatformB platformB12 = new PlatformB();
        addObject(platformB12,644,695);
        platformB12.setLocation(676,726);
        platformA13.setLocation(239,518);
        platformA12.setLocation(250,507);
        platformA13.setLocation(301,515);
        platformA12.setLocation(234,501);
        platformA2.setLocation(278,574);
        platformB6.setLocation(140,565);
        platformB6.setLocation(131,568);
        platformB6.setLocation(129,561);

        platformA12.setLocation(225,500);
        platformA12.setLocation(192,502);
        platformA14.setLocation(280,457);
        removeObject(platformA14);
        platformA12.setLocation(200,505);
        removeObject(platformA12);
        removeObject(platformA11);
        PLatformD pLatformD = new PLatformD();
        addObject(pLatformD,173,483);
        pLatformD.setLocation(199,500);
        platformA13.setLocation(267,513);
        platformA7.setLocation(730,173);
        platformB5.setLocation(72,195);
        platformB4.setLocation(42,181);
        removeObject(platformB4);
        PlatformC platformC6 = new PlatformC();
        addObject(platformC6,288,221);
        platformC6.setLocation(14,180);
        platformA10.setLocation(438,514);
        platformC.setLocation(523,517);
        platformB3.setLocation(593,471);
        platformC3.setLocation(699,470);
        platformA6.setLocation(748,554);
        platformB7.setLocation(658,556);
        removeObject(platformB12);
        platformB.setLocation(407,647);
        platformB2.setLocation(530,643);
        platformB6.setLocation(117,558);
        removeObject(platformB6);
        PlatformH platformH3 = new PlatformH();
        addObject(platformH3,74,565);
        platformH3.setLocation(54,557);
        platformB4.setLocation(135,559);
        platformA3.setLocation(238,724);
        platformB8.setLocation(692,655);
        platformB8.setLocation(771,659);
        platformB10.setLocation(705,657);
        removeObject(platformA2);
        platformA8.setLocation(94,417);
        removeObject(platformA8);
        PlatformH platformH4 = new PlatformH();
        addObject(platformH4,89,423);
        platformH4.setLocation(47,424);
        platformL.setLocation(385,779);
        PlatformC platformC7 = new PlatformC();
        addObject(platformC7,275,529);
        platformC7.setLocation(113,554);
        platformC7.setLocation(122,557);
        platformC7.setLocation(131,557);
        removeObject(platformC7);
        PlatformB platformB13 = new PlatformB();
        addObject(platformB13,359,562);
        platformB13.setLocation(130,561);
        platformB13.setLocation(136,559);
        platformL.setLocation(409,778);
        platformA10.setLocation(409,523);
        platformA10.setLocation(409,519);
        platformL.setLocation(397,783);
        platformL.setLocation(357,796);
        platformL.setLocation(559,781);
        platformA10.setLocation(446,518);
        platformB.setLocation(398,641);
        platformB2.setLocation(509,637);
        platformL.setLocation(436,775);
        platformB2.setLocation(526,643);
        platformC3.setLocation(697,473);
        platformC3.setLocation(682,474);
        platformC3.setLocation(693,475);
        RevertItem revertItem = new RevertItem();
        addObject(revertItem,254,454);
        removeObject(platformL);

        yellowIdle.setLocation(78,110);
        player3 player3 = new player3();
        addObject(player3,59,358);
        yellowIdle.setLocation(36,690);
    }

    private void addRandomRevertItem() {
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
        RevertItem revertItem = new RevertItem();
        addObject(revertItem, x, y);
    }
    public void act() {
        spawnTimer++;
        if (spawnTimer >= spawnInterval) {
            addRandomRevertItem();
            spawnTimer = 0;
        }
    }
}
