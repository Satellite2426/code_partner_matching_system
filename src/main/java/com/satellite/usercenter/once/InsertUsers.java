package com.satellite.usercenter.once;
import java.util.Date;

import com.satellite.usercenter.mapper.UserMapper;
import com.satellite.usercenter.model.domain.User;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import javax.annotation.Resource;

@Component
public class InsertUsers {

    @Resource
    private UserMapper userMapper;

    /**
     * 批量插入用户
     */
//    @Scheduled(initialDelay = 5000, fixedRate = Long.MAX_VALUE)
    public void doInsertUsers() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        final int INSERT_NUM = 1000;
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
            userMapper.insert(user);
        }
        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeMillis());
    }

}
