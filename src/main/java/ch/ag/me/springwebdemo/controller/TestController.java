package ch.ag.me.springwebdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @GetMapping("/tests")
    public List<String> getTests() {
        return List.of(new String[]{"True", "Lol"});
    }

}
