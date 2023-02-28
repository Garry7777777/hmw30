package skypro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerNew {

    @GetMapping("/")
    public String showCommonRoom() {
        return "commonRoom";
    }

    @GetMapping("/it")
    public String showITRoom() {
        return "itRoom";
    }

    @GetMapping("/security")
    public String showSecurityRoom() {
        return "securityRoom";
    }

    @GetMapping("/director")
    public String showDirectorRoom() {
        return "directorRoom";
    }
}