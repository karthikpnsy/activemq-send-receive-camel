package com.karthik.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQMsgConsumerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	
    	
        from("activemq:sendqueue").log("${body}")
                .to("log:received-message-from-active-mq").to("activemq:receivequeue");
        
        
    }
    
    
}


