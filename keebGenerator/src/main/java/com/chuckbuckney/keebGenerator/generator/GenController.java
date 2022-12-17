package com.chuckbuckney.keebGenerator.generator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/generator")
public class GenController {

    //base endpoint
    @GetMapping(path="")
    public void test() {

    }

}
