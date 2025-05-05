package main;

import model.LightBulb;

/**
 * Object Methods
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D03_ObjectMethods {

   public static void main(String[] args) {
      LightBulb redLightBulb1 = new LightBulb("red");
      LightBulb redLightBulb2 = new LightBulb("red");
      LightBulb blueLightBulb = new LightBulb("blue");

      System.out.println(redLightBulb1 == redLightBulb2);
      System.out.println(redLightBulb1.equals(redLightBulb2));

      System.out.println(Integer.toHexString(redLightBulb1.hashCode()));
      System.out.println(Integer.toHexString(redLightBulb2.hashCode()));
      System.out.println(Integer.toHexString(blueLightBulb.hashCode()));

      System.out.println(redLightBulb1);
      System.out.println(redLightBulb2);
      System.out.println(blueLightBulb);
   }

}
