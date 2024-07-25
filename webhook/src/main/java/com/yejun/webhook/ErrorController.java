package com.yejun.webhook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

    @GetMapping("/throwError")
    public String throwError() {
        throw new RuntimeException("This is a deliberate exception");
    }
}
