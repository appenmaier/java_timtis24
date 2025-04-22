package model;

import lombok.Getter;

/**
 * TableLight
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Getter
public class TableLight {

   private boolean isConnected;
   private boolean isOn;
   private LightBulb lightBulb;

   public TableLight() {}

   public TableLight(String lightBulbColor) {
      lightBulb = new LightBulb(lightBulbColor);
   }

   public TableLight(LightBulb lightBulb) {
      this.lightBulb = lightBulb;
   }

   public void plugIn() {
      isConnected = true;
   }

   public void pullThePlug() {
      isConnected = false;
   }

   public void switchOn() {
      isOn = true;
   }

   public void switchOff() {
      isOn = false;
   }

   public LightBulb changeLightBulb(LightBulb newLightBulb) {
      LightBulb oldLightBulb = lightBulb;
      lightBulb = newLightBulb;
      return oldLightBulb;
   }

   public boolean isShining() {
      // if (isConnected == true && isOn == true && lightBulb != null) {
      // return true;
      // } else {
      // return false;
      // }
      return isConnected && isOn && lightBulb != null;
   }

}
