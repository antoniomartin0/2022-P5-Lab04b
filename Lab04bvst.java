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

        g.drawLine(25,-25,75,-75);
        g.drawLine(25,-25,25,-150);
        g.drawLine(25,-25,150,-25);
        g.drawLine(25,-150,75,-200);
        g.drawLine(150,-25,200,-75);
        g.drawLine(75,-75,200,-75);
        g.drawLine(75,-75,75,-200);
        g.drawLine(200,-75,200,-200);
        g.drawLine(75,-200,200,-200);

        // DRAW SPHERE

        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE

        // DRAW APCS

        g.drawRect(25,-475,25,-600);
        // DRAW PACMEN FLOWER



    }

}


