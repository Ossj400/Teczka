package pl.example.spring.Teczka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class Hello {
    @RequestMapping("/hello")
    public String Hallo()
    {
        return "hello time is: " + LocalDateTime.now();
    }
}
