package common;

/**
 * Created by Eynar on 05/10/2016.
 */
public class Custom_response {

        public String json_body="";
        public int code_status=0;
        public String message_status="";

        public Custom_response(String body, int code, String message) {

            json_body = body;
            code_status = code;
            message_status = message;
        }

        public Custom_response() {

        }
}
