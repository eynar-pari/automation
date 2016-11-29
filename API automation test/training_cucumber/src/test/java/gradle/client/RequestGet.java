package gradle.client;

import common.Custom_response;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static common.My_values.*;


/**
 * Created by Eynar on 3/3/2016.
 */
public class RequestGet implements Request {

    public RequestGet(){}

    public Custom_response send(String path, String body) {
        WebTarget target = client.target(SERVER_MAIN_URL + path);
        Response response_actual = target.request(MediaType.APPLICATION_JSON_TYPE).header(Authentication, Authentication_value).header(ACCEPT,ACCEPT_JSON_TEXT_ALL).get();
        Custom_response response = new Custom_response(response_actual.readEntity(String.class).toString(),
                response_actual.getStatus(),
                response_actual.getStatusInfo().toString());
        response_actual.close();
        return response;
    }

}

