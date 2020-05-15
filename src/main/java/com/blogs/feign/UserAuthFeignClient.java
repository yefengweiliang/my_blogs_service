package com.blogs.feign;

import com.blogs.entity.pojo.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user-auth-service")
@Component
public interface UserAuthFeignClient {

    @PostMapping(value = "/userAuth/getUser")
    public Object getUserInfo(@RequestBody UserInfo userInfo) ;
}
