package com.demo.integration.play;

import com.bs.proteo.soa.service.mainframe.consultatin.domain.Operation01RequestInputData;
import com.bs.proteo.soa.service.mainframe.consultatin.domain.message.Operation01Request;
import com.bs.proteo.soa.shared.data.v2.ClientInfo;
import com.bs.proteo.soa.shared.data.v2.HeaderRequest;
import com.bs.proteo.soa.shared.data.v2.HostRequest;
import com.demo.integration.play.config.SoapToRestIntegrationApplication;
import com.demo.integration.play.service.TibcoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jakarta.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import jakarta.xml.soap.SOAPException;
import java.io.FileNotFoundException;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {SoapToRestIntegrationApplication.class})
public class PuenteTests {

    @Autowired
    private TibcoService tibcoService;

    @Test
    public void testService() throws JAXBException, FileNotFoundException, SOAPException, ParserConfigurationException {
        Operation01Request request = new Operation01Request();
        HeaderRequest headerRequest = new HeaderRequest();
        headerRequest.setTrackingId("1");
        ClientInfo clientInfo = new ClientInfo();
        clientInfo.setApplicationId("1");
        clientInfo.setLanguage("1");
        headerRequest.setClientInfo(clientInfo);
        HostRequest hostRequest = new HostRequest();
        hostRequest.setAuthorizationId(1);
        hostRequest.setComplianceId("1");
        hostRequest.setSessionId("83ad3ec0-1e77-441e-8e98-64e02148645a");
        headerRequest.setHostRequest(hostRequest);
        request.setHeaderRequest(headerRequest);
        Operation01RequestInputData inputData = new Operation01RequestInputData();
        inputData.setPE7537IIDTITULAR("015564697");
        inputData.setPE7537IIBANSOL("ES680081");
        request.setInputData(inputData);
//        Operation01Response response = tibcoService.envioTibco(request);

    }

}
