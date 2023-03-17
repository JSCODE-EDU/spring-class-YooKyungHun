package com.jscode.spring.day03;

import lombok.extern.slf4j.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

//    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping("api/test")
    public String test() {
        return "test";
    }

    @GetMapping("member/{name}")
    // http://localhost:8080/member/HongGilDong
    public String getMyName(@PathVariable("name") String name) {
        log.info("-- Log Test (Path Variable) --");
        return "검색한 이름 : " + name;
    }

    @GetMapping("input")
    // http://localhost:8080/input?name=HongGilDong
    public String getInputName(@RequestParam String name) {
        log.info("-- Log Test (Quary Parameter) --");
        return name;
    }
}