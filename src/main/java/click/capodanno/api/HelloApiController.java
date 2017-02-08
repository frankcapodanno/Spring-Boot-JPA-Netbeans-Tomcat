package click.capodanno.api;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloApiController {

    @RequestMapping("/")
    public GreetingBean index() {
        GreetingBean hello = new GreetingBean();
        return hello;
    }
}
