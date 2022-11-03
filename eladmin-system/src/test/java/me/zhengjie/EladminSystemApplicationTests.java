package me.zhengjie;

import me.zhengjie.modules.security.service.UserCacheManager;
import me.zhengjie.modules.system.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EladminSystemApplicationTests {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserCacheManager userCacheManager;

    @Test
    public void contextLoads() {
        String encode = passwordEncoder.encode("123456");

        System.out.println(encode);
//        userCacheManager.cleanUserCache("hwyee");
        boolean matches = passwordEncoder.matches("123456", encode);
        System.out.println(matches);
    }

    public static void main(String[] args) {
    }
}

