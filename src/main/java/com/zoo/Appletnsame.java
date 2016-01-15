package com.zoo;

/**
 * Created by networkdanik on 1/15/16.
 */
public class Appletnsame extends  java.applet.Applet {
    int zahl;

    @Override
    public void init() {
        zahl = 1000;

    }

   public  void  paint(java.awt.Graphics g) {
       g.drawString("zahl =" + zahl, 30, 30);
   }
}

