package gradle.client;

import common.Custom_response;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static common.My_values.*;

/**
 * Created by Eynar on 3/3/2016.
 */
public class RequestPost implements Request {

    public RequestPost(){}
    @Override
    public Custom_response send(String path, String body) {
        Response response_actual;
        WebTarget target = client.target(SERVER_MAIN_URL + path);
        Entity entity = Entity.json(body);
        response_actual = target.request(MediaType.APPLICATION_JSON_TYPE).header(Authentication, Authentication_value).post(entity);
        Custom_response response = new Custom_response(response_actual.readEntity(String.class).toString(),
                response_actual.getStatus(),
                response_actual.getStatusInfo().toString());
        response_actual.close();

        System.out.println("Body Response : " +response.json_body);
        System.out.println("Response Code: " + response.code_status);

        return response;
    }
}
