package io.github.wukn.demo.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import io.github.wukn.demo.dubbo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public boolean login(String username, String password) {
        boolean result = false;
        if ("admin".equals(username)) {
            if ("123456".equals(password)) {
                result = true;
            }
        }
        return result;
    }
}
