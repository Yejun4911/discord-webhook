package com.yejun.webhook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

    @GetMapping("/error")
    public String throwError() {
        throw new RuntimeException("Error  exception");
    }
}
