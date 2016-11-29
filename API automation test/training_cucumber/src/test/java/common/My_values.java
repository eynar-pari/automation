package common;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eynar on 12/03/2016.
 */

public class My_values extends GetSystemProperties {

    // TENANT GROUP
    public static final String GET = "get";
    public static final String POST = "post";
    public static final String PUT = "put";
    public static final String PATCH = "patch";
    public static final String DELETE = "delete";

    public static final String ACCEPT = "Accept";
    public static final String ACCEPT_JSON_TEXT_ALL = "application/json, text/plain, */*";
    public static final String TEXT_PLAIN = "text/plain";
    // Configuration
    public static final String HTTP = protocol;
    public static final String HOST = HTTP + host;
    public static final String EMPTY_STRING = "";
    public static final String REST_API = "/api/";
    public static final String SERVER_MAIN_URL = HOST  + REST_API;

    public static final String Authentication = "Authorization";
    public static final String Authentication_value = "ZXluYXIucGFyaUBnbWFpbC5jb206Q29udHJvbDEyMw==";
    public static Map<String,String> JsonValues=null;

}

