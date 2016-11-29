package common;

import java.io.File;


/**
 * Created by Alvaro on 4/6/2016.
 */
public class GetSystemProperties {

    public static final String host = System.getProperty("HOST")==null?"todo.ly": System.getProperty("HOST");
    public static final String port = System.getProperty("PORT")==null?"": System.getProperty("PORT");
    public static final String protocol = System.getProperty("PROTOCOL")==null?"http://": System.getProperty("PROTOCOL");
}
