package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Flash Light
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class FlashLight extends Light {

   // private boolean isOn;
   private double energyLevel;

   public FlashLight() {
      energyLevel = 0.5;
   }

   @Override
   public void switchOn() {
      // isOn = true;
      super.switchOn();
      energyLevel -= 0.1;
   }

   // public void switchOff() {
   // isOn = false;
   // }

   public void recharge() {
      energyLevel = 1;
   }

   @Override
   public boolean isShining() {
      return isOn() && energyLevel > 0;
   }

}
