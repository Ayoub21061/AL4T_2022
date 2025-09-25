package be.ecam.basics.exercises;

import java.util.List;
import java.util.Iterator;

// public class ListUtils {
//     public static List<String> removeShortStrings(List<String> list, int minLen) {
//         for (String s : list) {
//             if (s.length() < minLen) {
//                 list.remove(s);
//             }
//         }
//         return list;
//     }
// }

public class ListUtils {

    public static List<String> removeShortStrings(List<String> list, int minLen) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().length() < minLen) {
                it.remove();
            }
        }
        return list;
    }

}

// public static List<String> removeShortStrings(List<String> list, int minLen) {
//     list.removeIf(s -> s.length() < minLen);
//     return list;
// }


