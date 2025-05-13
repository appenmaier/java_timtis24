package model;

import lombok.Data;

/**
 * Toaster
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Data
public class Toaster implements WiredDevice {

   private boolean isConnected;

   @Override
   public void plugIn() {
      isConnected = true;
   }

   @Override
   public void pullThePlug() {
      isConnected = false;
   }

}
