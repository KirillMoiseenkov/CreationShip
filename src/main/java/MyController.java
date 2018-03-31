import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {





    @RequestMapping(value = "/New", method = RequestMethod.GET)
    public String hello(ModelMap model){


        System.out.println("Pozor - hello");


        model.addAttribute("message", "Spring 3 MVC Hello World!!!");
        return "MyHello";

    }

}
