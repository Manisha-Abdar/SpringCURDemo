package com.employee.customactuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="customerActuator")
public class CustomActuator {

	@ReadOperation
	public String currentDbDetails() {
		return "Give current DB status of the application";
	}
}
