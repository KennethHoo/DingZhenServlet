package fuck.manthe.nmsl.service;

import com.standardwebhooks.exceptions.WebhookSigningException;
import fuck.manthe.nmsl.entity.BaseWebhookMessage;
import fuck.manthe.nmsl.entity.WebhookEndpoint;

import java.util.List;

public interface WebhookService {
    /**
     * Add a webhook
     *
     * @param name   Name in dashboard
     * @param url    endpoint
     * @param secret Base64 secret key
     */
    WebhookEndpoint add(String name, String url, String secret);

    WebhookEndpoint find(String id);

    List<WebhookEndpoint> list();

    void remove(String id);

    WebhookEndpoint update(WebhookEndpoint entity);

    /**
     * Push a message to a webhook
     *
     * @param endpoint the webhook
     * @param msgId    event name
     * @param payload  payload data
     */
    void push(WebhookEndpoint endpoint, String msgId, String payload) throws WebhookSigningException;

    /**
     * Push a message to all webhooks
     */
    void pushAll(String msgId, BaseWebhookMessage payload) throws WebhookSigningException;
}
