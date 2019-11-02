package mod;

import java.util.ArrayList;
import java.util.HashMap;

public class Init {

 public static String $_Confing = "";
 public static ArrayList<Object[]> $_Groups = new ArrayList< Object[]>();
 public static int $_DefaultIndex = 0;

 public static void Init() {
 }

 public static void GroupSet(String groupName, String[] permissions, String[] prefix, String[] suffix, String instance, boolean isBase) {
  try {
   if (isBase) {
    Object[] o = $_Groups.get($_DefaultIndex);
    $_Groups.set($_DefaultIndex, new Object[]{o[0], o[1], o[2], o[3], o[4], false, o[6]});
   }
  } catch (Exception e) {
  }
  $_Groups.add(new Object[]{groupName, permissions, prefix, suffix, instance, isBase, new String[]{}});
  System.out.println("group [" + groupName + "] been putted");

 }

 public static String getGroupWorlds(int group) {
  String ret = "";
  String[] worlds = (String[]) $_Groups.get(group)[6];
  for (int i = 0; i < worlds.length; i++) {
   ret += "      " + worlds[i] + ":\n        permissions:\n        options:\n          prefix:\n          suffix:\n";
  }
  return ret;
 }
}
