package aylee.kubernetes.demofront.service;

import aylee.kubernetes.demofront.domain.HelloData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HelloService {
    private static String API_URL = "http://demo-api.demo.svc.cluster.local:8090";

    public List<HelloData> findList() {
        String url = API_URL+"/list";
        System.out.println("======== API URL : "+url);
        RestTemplate restTemplate = new RestTemplate();
        List<HelloData> helloDatas = Arrays.asList(restTemplate.getForObject(url, HelloData[].class));
        return helloDatas;
    }

    public Long add(HelloData helloData) {
        String url = API_URL+"/hello?myName="+helloData.getInputData();
        System.out.println("======== API URL : "+url);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, HelloData.class).getId();

    }


}
