package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.FlashLight;
import model.Light;
import model.LightBulb;
import model.TableLight;
import model.Toaster;
import model.WiredDevice;

/**
 * Inheritance
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D05_Inheritance {

   public static List<Light> getLights() {
      List<Light> lights = new LinkedList<>();
      lights.add(new TableLight());
      lights.add(new TableLight());
      lights.add(new TableLight());
      return lights;
   }

   public static void main(String[] args) {
      /* Ohne Vererbung */
      ArrayList<TableLight> tableLights = new ArrayList<>();
      tableLights.add(new TableLight());
      tableLights.add(new TableLight());
      tableLights.add(new TableLight());

      ArrayList<FlashLight> flashLights = new ArrayList<>();
      flashLights.add(new FlashLight());
      flashLights.add(new FlashLight());
      flashLights.add(new FlashLight());

      for (TableLight t : tableLights) {
         t.switchOn();
         t.plugIn();
         t.changeLightBulb(new LightBulb("white"));
         System.out.println(t.isShining());
         System.out.println(t);
      }

      for (FlashLight f : flashLights) {
         f.switchOn();
         f.recharge();
         System.out.println(f.isShining());
         System.out.println(f);
      }
      System.out.println();

      /* Mit Vererbung */
      ArrayList<Light> lights = new ArrayList<>();
      lights.add(new TableLight()); // Upcast
      lights.add(new FlashLight()); // Upcast
      lights.add(new TableLight()); // Upcast
      lights.add(new FlashLight()); // Upcast
      lights.add(new TableLight()); // Upcast
      lights.add(new FlashLight()); // Upcast
      // lights.add(new Light());

      for (Light l : lights) {
         l.switchOn(); // (Dynamische) Polymorphie
         if (l instanceof TableLight) {
            TableLight t = (TableLight) l; // Downcast (bis Java 16)
            t.plugIn();
            t.changeLightBulb(new LightBulb("white"));
         } else if (l instanceof FlashLight f) { // Downcast (seit Java 16)
            f.recharge();
         }
         System.out.println(l.isShining()); // (Statische + Dynamische) Polymorphie
         System.out.println(l);
      }

      /* Schnittstellen */
      List<WiredDevice> wiredDevices = new ArrayList<>();
      wiredDevices.add(new Toaster()); // Upcast
      wiredDevices.add(new Toaster()); // Upcast
      wiredDevices.add(new TableLight()); // Upcast
      wiredDevices.add(new Toaster()); // Upcast
      wiredDevices.add(new TableLight()); // Upcast

      for (WiredDevice d : wiredDevices) {
         d.plugIn(); // (Dynamische) Polymorphie
         if (d instanceof TableLight t) { // Downcast
            t.switchOn();
            t.changeLightBulb(new LightBulb("white"));
         }
         System.out.println(d);
      }
   }

}
