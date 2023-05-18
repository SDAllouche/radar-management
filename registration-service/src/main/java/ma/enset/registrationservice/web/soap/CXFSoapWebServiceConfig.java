package ma.enset.registrationservice.web.soap;

import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class CXFSoapWebServiceConfig {

    @Autowired
    private Bus bus;
    @Autowired
    private RegistrationSoapController registrationSoapController;

    @Bean
    public EndpointImpl endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, registrationSoapController);
        endpoint.publish("/CarService");
        return endpoint;
    }

}
