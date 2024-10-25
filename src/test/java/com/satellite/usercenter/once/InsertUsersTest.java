package com.satellite.usercenter.once;

import com.satellite.usercenter.mapper.UserMapper;
import com.satellite.usercenter.model.domain.User;
import com.satellite.usercenter.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InsertUsersTest {

    @Resource
    private UserService userService;

    /**
     * 批量插入用户
     */
    @Test
    public void doInsertUsers() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        final int INSERT_NUM = 1000;
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < INSERT_NUM; i++) {
            User user = new User();
            user.setUsername("假卫星");
            user.setUserAccount("fakeCodeHan");
            user.setAvatarUrl("https://csh-picture.oss-cn-shenzhen.aliyuncs.com/img202410181438560.png");
            user.setGender(0);
            user.setUserPassword("12345678");
            user.setPhone("15866665555");
            user.setEmail("123@qq.com");
            user.setUserStatus(0);
            user.setUserRole(0);
            user.setPlanetCode("111");
            userList.add(user);

        }
        userService.saveBatch(userList, 100);
        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeMillis());
    }

    /**
     * 并发批量插入用户
     */
    @Test
    public void doConcurrencyInsertUsers() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        final int INSERT_NUM = 100000;

        List<User> userList = new ArrayList<>();
        for (int i = 0; i < INSERT_NUM; i++) {
            User user = new User();
            user.setUsername("假卫星");
            user.setUserAccount("fakeCodeHan");
            user.setAvatarUrl("https://csh-picture.oss-cn-shenzhen.aliyuncs.com/img202410181438560.png");
            user.setGender(0);
            user.setUserPassword("12345678");
            user.setPhone("15866665555");
            user.setEmail("123@qq.com");
            user.setUserStatus(0);
            user.setUserRole(0);
            user.setPlanetCode("111");
            userList.add(user);

        }
        userService.saveBatch(userList, 100);
        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeMillis());
    }
}