package common;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.JSONObject;
import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import static common.My_values.*;

/**
 * Created by Eynar on 11-Mar-16.
 */

public class Helper {

    private int whereProperty=2;
    private int eqValue=4;
    private int propertyName= 0;
    /**
     * Convert string to jsonObject
     *
     * @param json: It's json with a String format
     * @return return the same value converted to json
     */
    public JSONObject parserJSON(String json) {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    /**
     * Get a value from JSONObject
     *
     * @param js:    JSONbject
     * @param value: String
     * @return String
     */
    public String getJsonValue(JSONObject js, String value) {
        String out = EMPTY_STRING;
        try {
            out = js.get(value).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }
}
