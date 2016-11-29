package common;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;


/**
 * Created by Eynar on 4/5/2016.
 */
public class Custom_assert {

    /* This method is to compare a json file and ignore some properties.
    *
    * */

    public static Boolean areEqual(String expected_result, String actual_result) throws JSONException {
        Boolean areEqual = true;
        Helper parser = new Helper();
        try {
            JSONObject js_expected = parser.parserJSON(expected_result);
            JSONObject js_actual = parser.parserJSON(actual_result);
            Iterator<?> keys = js_expected.keys();
            while (keys.hasNext() && areEqual) {
                String key = (String) keys.next();
                if (!js_expected.get(key).toString().equals("IGNORE")) {
                    System.out.println("Property: " + key + " - Comparing Expected Result : " + js_expected.get(key).toString() + " and Actual Result : " + js_actual.get(key).toString());
                    if (js_actual.get(key).toString().contains("[{") && js_actual.get(key).toString().contains("}]")) {

                        JSONArray jArray = js_actual.getJSONArray(key);
                        JSONArray jArrayExpected = js_expected.getJSONArray(key);
                        for (int i = 0; i < jArray.length(); i++) {
                            areEqual = areEqual(jArrayExpected.getString(i), jArray.getString(i));
                        }

                    } else if (js_actual.get(key).toString().contains("{") && js_actual.get(key).toString().contains("}") && !js_actual.get(key).toString().contains("${")) {
                        areEqual = areEqual(js_expected.get(key).toString(), js_actual.get(key).toString());
                    } else if (js_actual.get(key).toString().contains("[") && js_actual.get(key).toString().contains("]")) {
                        String[] expected = js_expected.get(key).toString().replace("[", "").replace("]", "").split(",");
                        String[] actual = js_actual.get(key).toString().replace("[", "").replace("]", "").split(",");
                        Arrays.sort(expected);
                        Arrays.sort(actual);
                        for (int position = 0; position < expected.length; position++) {
                            if (!expected[position].equals(actual[position])) {
                                areEqual = false;
                            }
                        }

                    } else if (!js_expected.get(key).toString().equals(js_actual.get(key).toString())) {
                        areEqual = false;
                        assertEquals(expected_result, actual_result);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals(expected_result,actual_result);
        }
        return areEqual;
    }

}
