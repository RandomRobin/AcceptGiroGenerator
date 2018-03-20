package domain;

import javax.xml.ws.Endpoint;

import service.GiroServiceImpl;


public class main {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8070/getAcceptGiro?wsdl", new GiroServiceImpl());
	}

}
