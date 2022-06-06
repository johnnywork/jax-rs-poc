package poc.ioannis.microprofile_poc;

import javax.ws.rs.client.ClientBuilder;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import ch.cembra.ecmi.elo.client.api.ApiApi;

public class RestApi {
	
	private ApiApi api;
	
	public void init() {
	
		ResteasyClient client = (ResteasyClient) ClientBuilder.newClient();
		ResteasyWebTarget target = client.target("http://127.0.0.1:8082/resteasy/rest");
		api = target.proxy(ApiApi.class);

	}
}
