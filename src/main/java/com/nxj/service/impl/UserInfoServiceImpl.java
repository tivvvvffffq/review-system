package com.nxj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nxj.mapper.UserInfoMapper;
import com.nxj.service.IUserInfoService;
import com.nxj.entity.UserInfo;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
