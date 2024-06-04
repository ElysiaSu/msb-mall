package com.msb.nacosopenfeign.openfeign;

import com.msb.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("mall-producet")
public interface OpenfeignServce {

    @GetMapping("/fastTest")
    public R fastTest();
}
