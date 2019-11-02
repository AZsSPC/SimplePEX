package mod;

import java.util.ArrayList;
import static mod.Init.$_Groups;
import static mod.Init.getGroupWorlds;

public class Logic {

 public static String permissionCompiliter() {
  String tOut = ""
   + "################################\n"
   + "# Created by AZsSPC and AZ_218 #\n"
   + "################################\n"
   + "schema-version: 1\n\ngroups:\n";
  String World = "";
  for (int i = 0; i < $_Groups.size(); i++) {
   Object[] Data = $_Groups.get(i);
   String Name = Data[0] + "";
   String[] pList = (String[]) Data[1];
   String[] Prefix = (String[]) Data[2];
   String[] Suffix = (String[]) Data[3];
   String Instance = Data[4] + "";
   boolean Default = (boolean) Data[5];

   String tSecond = "  " + Name
    + ":\n    permissions:\n    options:"
    + "\n      default: " + Default
    + "\n      prefix: " 
    + "\n      suffix: " 
    + "\n    inheritance: "
    + "\n    worlds:\n" + getGroupWorlds(i) + "#\n";

   for (int index = 0; index < pList.length; index++) {
    String[] pData = pList[index].split(",");
    World = pData[0];

    if (World.equals("")) {
     if (pData[1].equals("true")) {
      tSecond = tSecond.substring(0, tSecond.indexOf("    permissions:") + "    permissions:".length()) + "\n" + "    - " + pData[2] + tSecond.substring(tSecond.indexOf("    permissions:") + "    permissions:".length());
     } else {
      tSecond = tSecond.substring(0, tSecond.indexOf("    permissions:") + "    permissions:".length()) + "\n" + "    - -" + pData[2] + tSecond.substring(tSecond.indexOf("    permissions:") + "    permissions:".length());
     }
    } else {/*
     if (pData[1].equals("true")) {
      tSecond = tSecond.substring(0, tSecond.indexOf("    permissions:") + "    permissions:".length()) + "\n" + "    - " + pData[2] + tSecond.substring(tSecond.indexOf("    permissions:") + "    permissions:".length());
     } else {
      tSecond = tSecond.substring(0, tSecond.indexOf("    permissions:") + "    permissions:".length()) + "\n" + "    - -" + pData[2] + tSecond.substring(tSecond.indexOf("    permissions:") + "    permissions:".length());
     }*/
    }
   }
   tOut += tSecond;

  }
  return tOut;
 }
}
