package aylee.kubernetes.demofront.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HomeService {
    private static String API_URL = "http://demo-api.demo.svc.cluster.local:8090";

    public String home() {
        String url = API_URL+"/";
        System.out.println("======== API URL : "+url);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);

    }
}
