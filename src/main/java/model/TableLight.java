package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * TableLight
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public final class TableLight extends Light implements WiredDevice {

   private boolean isConnected;
   // private boolean isOn;
   private LightBulb lightBulb;
   private final PlugType plugType;

   public TableLight() {
      plugType = PlugType.TYPE_F;
   }

   public TableLight(String lightBulbColor, PlugType plugType) {
      lightBulb = new LightBulb(lightBulbColor);
      this.plugType = plugType;
   }

   public TableLight(LightBulb lightBulb, PlugType plugType) {
      this.lightBulb = lightBulb;
      this.plugType = plugType;
   }

   @Override
   public void plugIn() {
      isConnected = true;
   }

   @Override
   public void pullThePlug() {
      isConnected = false;
   }

   // public void switchOn() {
   // isOn = true;
   // }

   // public void switchOff() {
   // isOn = false;
   // }

   public LightBulb changeLightBulb(LightBulb newLightBulb) {
      LightBulb oldLightBulb = lightBulb;
      lightBulb = newLightBulb;
      return oldLightBulb;
   }

   @Override
   public boolean isShining() {
      // if (isConnected == true && isOn == true && lightBulb != null) {
      // return true;
      // } else {
      // return false;
      // }
      return isConnected && isOn() && lightBulb != null;
   }

}
