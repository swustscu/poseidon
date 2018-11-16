package com.yoke.poseidon.web.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yoke.poseidon.web.entity.User;
import com.yoke.poseidon.web.mapper.UserMapper;
import com.yoke.poseidon.web.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ehereal
 * @since 2018-09-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
		implements UserService {

}