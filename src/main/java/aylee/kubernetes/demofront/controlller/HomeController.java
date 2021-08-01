package aylee.kubernetes.demofront.controlller;

import aylee.kubernetes.demofront.domain.InfraInfo;
import aylee.kubernetes.demofront.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final HomeService homeService;
    @Value("${application.version}")
    private String applicationVersion;

    @RequestMapping("/")
    public String home(Model model) {
        System.out.println("Welcome to Aylees Kubernetes Sample App!!!");
        InfraInfo infraInfo = new InfraInfo(
                System.getenv("NODE_NAME"),
                System.getenv("NODE_IP"),
                System.getenv("POD_NAME"),
                System.getenv("POD_IP"),
                System.getenv("NAMESPACE")
        );
        model.addAttribute("version", applicationVersion);
        model.addAttribute("infraInfo", infraInfo);

        return "home";
    }
}
