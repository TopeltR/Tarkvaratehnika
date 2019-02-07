package ee.taltech.tarkvaratehnika.prax1.Info;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prax1/info")
public class InfoController {

    @PostMapping("/")
    public void getInfo() {

    }
}
