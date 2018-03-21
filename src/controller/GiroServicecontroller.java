package controller;

import javax.xml.ws.Endpoint;

import service.GiroServiceImpl;


public class GiroServicecontroller {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8070/getAcceptGiro?wsdl", new GiroServiceImpl());
	}

}
