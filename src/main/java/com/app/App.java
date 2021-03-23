package com.app;

import com.jk.util.JK;
import com.jk.util.config.JKConfig;
import com.jk.web.services.client.JKServiceClient;

public class App {
	public static void main(String[] args) {
		//with tomcat: http://localhost:8080/yourContext/app/example	
		JKServiceClient<Model> client = new JKServiceClient<>("http://localhost:8080/app/commands", Model.class);

		Model model=new Model();
		model.setId("12345678");
		model.setName("Ata");
		String response = client.callJsonWithPost("/exec",model);
		JK.print(response);

	}
}