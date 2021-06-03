package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") //get 방식
    public String hello(Model model) {
        model.addAttribute("data", "hello!");
        return "hello"; //렌더링하는 곳
    }
}
