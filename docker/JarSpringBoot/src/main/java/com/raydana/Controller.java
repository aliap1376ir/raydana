package com.raydana;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/")
    private String helloWorld() {
        String code = SlugGenerator.generate(SlugGenerator.Options.GENERATE_FROM_NUMBERS_AND_LETTERS, 10);
        System.out.println(code);
        return code;
    }
}
