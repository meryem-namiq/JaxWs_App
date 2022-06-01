package amoa.server;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import amoa.webservices.ProductsManagermpl;

public class ServicePublisher {
	private static Logger logger=  LoggerFactory.getLogger(ServicePublisher.class);
	
	public static void main(String[] args) {
		logger.info("Saarting server");
		Endpoint.publish("http://localhost/webservices/ProductSManager", new ProductsManagermpl());
		logger.info("Server started");
	}
}
