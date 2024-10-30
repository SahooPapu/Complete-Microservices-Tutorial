package com.bip.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "first-api")
public interface IFirstApiFeignClient {
    @GetMapping("/first-api")
     String getFirstApi();
}
