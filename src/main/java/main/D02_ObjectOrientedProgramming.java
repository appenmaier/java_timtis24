package main;

import model.LightBulb;
import model.PlugType;
import model.TableLight;

/**
 * Object Oriented Programming
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D02_ObjectOrientedProgramming {

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      LightBulb redLightBulb = new LightBulb("red");
      LightBulb blueLightBulb = new LightBulb("blue");

      TableLight light1 = new TableLight();
      System.out.println(light1.isShining());
      light1.plugIn();
      light1.switchOn();
      light1.changeLightBulb(blueLightBulb);
      System.out.println(light1.isShining());
      System.out.println(light1.getLightBulb().color());

      TableLight light2 = new TableLight(redLightBulb, PlugType.TYPE_F);
      TableLight light3 = new TableLight("green", PlugType.TYPE_I);
   }

}
