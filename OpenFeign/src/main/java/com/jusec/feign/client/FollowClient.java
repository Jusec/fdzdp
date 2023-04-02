package com.jusec.feign.client;



import com.jusec.feign.entity.Follow;
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

@FeignClient(value = "follow-service")
@RestController
@RequestMapping("/follow")
public interface FollowClient {

    @GetMapping("/query/{id}")
    List<Follow> queryById(@PathVariable("id") Long id);

}
