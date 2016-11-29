package gradle.client;

/**
 * Created by Eynar on 3/3/2016.
 */
import common.Custom_response;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.io.FileNotFoundException;

public interface Request {
    Client client = ClientBuilder.newBuilder().build();

    public Custom_response send(String path, String body);

}
