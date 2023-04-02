package com.jusec.feign.client;



import com.jusec.feign.entity.User;
import com.jusec.utils.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName UserClient
 * @description:
 * @Author: Mo
 * @Date: 2023/03/30 23:08
 * @Version 17.0.1
 **/

@FeignClient(value = "user-service")
@RestController
@RequestMapping("/user")
public interface UserClient {

    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
    @PostMapping("/ids")
    List<UserDTO> userlist(@RequestBody List<Long> ids);
}
