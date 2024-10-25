package com.satellite.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.satellite.usercenter.mapper.UserTeamMapper;
import com.satellite.usercenter.model.domain.UserTeam;
import com.satellite.usercenter.service.UserTeamService;
import org.springframework.stereotype.Service;

/**
 * @author DELL
 * @description 针对表【user_team(用户-队伍关系)】的数据库操作Service实现
 * @createDate 2024-10-21 13:42:01
 */
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
        implements UserTeamService {

}




