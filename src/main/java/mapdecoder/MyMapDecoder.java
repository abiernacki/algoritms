/*
   This file is provided exclusively for the purpose of Spartez Online Assessment.
   Unauthorized distribution of this file, derived work or information about its
   content, via any medium, is strictly prohibited.
 */
package mapdecoder;

import java.util.HashMap;
import java.util.Map;

public class MyMapDecoder implements MapDecoder {


    public Map<String, String> decode(String s) {

        if (s == null) {
            return null;
        }

        if (s.isEmpty()) {
            return new HashMap();
        }

        String[] splitArray = s.split("&");

        Map<String, String> result = new HashMap<>();

        for (int i = 0; i < splitArray.length; i++) {
            if (splitArray[i].contains("=")) {
                String[] splitArray2 = splitArray[i].split("=");
                if (splitArray2.length != 2) {
                    throw new IllegalArgumentException();
                } else {
                    result.put(splitArray2[0], splitArray2[1]);
                }
            } else {
                throw new IllegalArgumentException();
            }
        }


        return result;

    }
}
