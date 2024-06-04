package com.msb.nacosopenfeign.openfeign;

import com.msb.nacosopenfeign.openfeign.OpenfeignServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenFeignController {
    @Autowired
    private OpenfeignServce openfeignServce;

    @GetMapping("/hello")
    public String test() {
        return openfeignServce.fastTest()+"";
    }
}
