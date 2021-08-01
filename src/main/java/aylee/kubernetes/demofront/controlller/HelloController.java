package aylee.kubernetes.demofront.controlller;

import aylee.kubernetes.demofront.domain.HelloData;
import aylee.kubernetes.demofront.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;


    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        HelloData helloData = new HelloData();
        helloData.setInputData(name);
        helloService.add(helloData);

        return "redirect:/list";
    }

    @GetMapping("/list")
    public String List(Model model) {
        List<HelloData> helloDatas = helloService.findList();
        model.addAttribute("helloDatas", helloDatas);
        return "dataList";
    }

}
