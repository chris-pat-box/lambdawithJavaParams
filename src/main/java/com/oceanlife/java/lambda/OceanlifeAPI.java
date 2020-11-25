package com.oceanlife.java.lambda;

import java.util.Collections;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class OceanlifeAPI implements RequestHandler<Object, GatewayResponse> {

	@Override
	public GatewayResponse handleRequest(Object input, Context context) {
		System.out.println("I am from Java Project");
		String message = "There I go with 2nd application";
		System.out.println(message);

		// To send the message back to the UI, we need to have Gateway Response
		// 200 - statuscode because of successfull reponse
		GatewayResponse response = new GatewayResponse(message, 200,
				Collections.singletonMap("DolpinVega", "OceanQueen"), false);
		return response;
	}
}
