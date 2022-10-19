// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE

        g.drawLine(25,25,75,75);
        g.drawLine(25,25,25,150);
        g.drawLine(25,25,150,25);
        g.drawLine(25,150,75,200);
        g.drawLine(150,25,200,75);
        g.drawLine(75,75,200,75);
        g.drawLine(75,75,75,200);
        g.drawLine(200,75,200,200);
        g.drawLine(75,200,200,200);

        // DRAW SPHERE


        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE

        g.drawLine(650,-175,850,-100);
        g.drawLine(650,-175,750,-275);
        g.drawLine(750,-275,850,-100);

        g.drawOval(700,250,75,125);
        g.drawOval(650,100,200,225);

        // DRAW APCS

        g.drawRect(25,475,25,125);
        g.drawRect(50,475,50,25);
        g.drawRect(75,500,25,100);
        g.drawRect(50,500,25,25);
        g.drawRect(50,525,25,25);
        g.fillRect(25,475,25,125);
        g.fillRect(50,475,50,25);
        g.fillRect(75,500,25,100);
        g.fillRect(50,500,25,25);
        g.fillRect(50,525,25,25);

        g.drawRect(125,475,25,125);
        g.drawRect(150,475,50,25);
        g.drawRect(150,500,25,25);
        g.drawRect(150,525,25,25);
        g.drawRect(175,500,25,50);
        g.fillRect(125,475,25,125);
        g.fillRect(150,475,50,25);
        g.fillRect(150,500,25,25);
        g.fillRect(150,525,25,25);
        g.fillRect(175,500,25,50);

        g.drawRect(225,475,25,125);
        g.drawRect(250,475,50,25);
        g.drawRect(250,575,50,25);
        g.fillRect(225,475,25,125);
        g.fillRect(250,475,50,25);
        g.fillRect(250,575,50,25);

        g.drawRect(325,475,75,25);
        g.drawRect(325,500,25,50);
        g.drawRect(350,525,50,25);
        g.drawRect(375,550,25,50);
        g.drawRect(325,575,75,25);
        g.fillRect(325,475,75,25);
        g.fillRect(325,500,25,50);
        g.fillRect(350,525,50,25);
        g.fillRect(375,550,25,50);
        g.fillRect(325,575,75,25);


        // DRAW PACMEN FLOWER



    }

}


