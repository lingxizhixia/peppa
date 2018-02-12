package com.peppa.teddy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/park")
public class ParkApplication {

    @RequestMapping("/space")
    public String space() {
        return "{'tempSpace':100,'tempTotal':200,'fixedSpace':10,'fixedTotal':20}";
    }

}
