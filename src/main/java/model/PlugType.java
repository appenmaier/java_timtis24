package model;

import lombok.Getter;

/**
 * Plug Type
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Getter
public enum PlugType {

   TYPE_F("Type-F", "CEE 7/4", "Europe"), TYPE_I("Type-I", "AS/NZS 3112", "Australia");

   private final String description;
   private final String norm;
   private final String region;

   PlugType(String description, String norm, String region) {
      this.description = description;
      this.norm = norm;
      this.region = region;
   }

}
