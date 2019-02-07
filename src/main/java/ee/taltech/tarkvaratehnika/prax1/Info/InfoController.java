package ee.taltech.tarkvaratehnika.prax1.Info;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/prax1/info")
public class InfoController {

    @GetMapping("/")
    public Info getInfo() {
        return new Info("Esimese praktikumi töö", "Rasmus Rüngenen");
    }
}
