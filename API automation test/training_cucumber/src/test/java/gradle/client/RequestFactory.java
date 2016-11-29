package gradle.client;



import static common.My_values.*;

/**
 * Created by Eynar on 3/3/2016.
 */
public class RequestFactory {

    public Request makeRequest(String method) {

        switch (method.toLowerCase()) {
            case (GET): { return new RequestGet();}
            case (PATCH):{ return new RequestPatch(); }
            case (POST):{return new RequestPost(); }
            case (PUT):{return new RequestPut();}
            case (DELETE): { return new RequestDelete();}
            default: {  return null;}
        }

    }
}