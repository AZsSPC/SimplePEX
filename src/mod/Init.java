package mod;

import java.util.HashMap;

public class Init {

 public static String $_Confing = "";
 public static HashMap<String, Object[]> $_Groups = new HashMap<String, Object[]>();

 public static void Init() {
 }

 public static void GroupSet(String groupName, String[][] permissions, String prefix, String suffix, boolean isBase, String instance) {
  if ($_Groups.get(groupName) == null) {
   $_Groups.put(groupName, new Object[]{permissions, prefix, suffix, isBase, instance});
   System.out.println("group [" + groupName + "] been putted");
   
  } else {
   $_Groups.replace(groupName, new Object[]{permissions, prefix, suffix, isBase, instance});
   System.out.println("group [" + groupName + "] been replaced");
  }

 }
}
