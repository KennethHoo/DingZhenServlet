package fuck.manthe.nmsl.controller;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @Resource
    RedisTemplate<String, Long> redisTemplate;

    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("colddown")
    public String coldDown() {
        return "colddown";
    }

    @GetMapping("redeem")
    public String register() {
        return "redeem";
    }
}
