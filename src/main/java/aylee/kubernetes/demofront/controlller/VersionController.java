package aylee.kubernetes.demofront.controlller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {
    @Value("${application.version}")
    private String applicationVersion;

    @RequestMapping("/version")
    public String home() {
        System.out.println("front version : "+applicationVersion);
        return "Front Version : " + applicationVersion;
    }
}
