package model;

/**
 * Light Bulb
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record LightBulb(String color) implements Comparable<LightBulb> {

   @Override
   public int compareTo(LightBulb otherLightBulb) {
      return color.compareTo(otherLightBulb.color);
   }

}
