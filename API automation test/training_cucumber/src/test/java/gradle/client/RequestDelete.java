package gradle.client;

import common.Custom_response;


import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static common.My_values.*;


/**
 * Created by Eynar on 3/3/2016.
 */
public class RequestDelete implements Request {
    @Override
    public Custom_response send(String path, String body) {
        WebTarget target = client.target(SERVER_MAIN_URL + path);
       Response response_actual = target.request(MediaType.APPLICATION_JSON_TYPE).header(Authentication, Authentication_value).delete();

        Custom_response response = new Custom_response(EMPTY_STRING,
                response_actual.getStatus(),
                response_actual.getStatusInfo().toString());
        response_actual.close();
        return response;
    }


}
