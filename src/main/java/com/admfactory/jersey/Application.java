package com.admfactory.jersey;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.server.TracingConfig;

@ApplicationPath("/")
public class Application extends ResourceConfig {

    public Application() {
	property(ServerProperties.TRACING, TracingConfig.ON_DEMAND.name());
    }
}
