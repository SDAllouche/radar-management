package ma.enset.radarservice.web.soap;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CXFSoapWebServiceConfig {

    @Autowired
    private Bus bus;
    @Autowired
    private RadarSoapController radarSoapController;

    @Bean
    public EndpointImpl endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, radarSoapController);
        endpoint.publish("/RadarService");
        return endpoint;
    }

}
