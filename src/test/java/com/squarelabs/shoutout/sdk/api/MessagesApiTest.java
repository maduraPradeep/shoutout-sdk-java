package com.squarelabs.shoutout.sdk.api;

import com.squarelabs.shoutout.sdk.model.Message;
import com.squarelabs.shoutout.sdk.ApiException;
import org.junit.Test;

/**
 * API tests for MessagesApi
 */
public class MessagesApiTest {

    //private final MessagesApi api = new MessagesApi();

    
    /**
     * 
     *
     * Send a direct message
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendMessageTest() throws ApiException {
        String authorization = null;
        Message message = null;
        // MessageResponse response = api.sendMessage(authorization, message);

        // TODO: test validations
    }
    
}
