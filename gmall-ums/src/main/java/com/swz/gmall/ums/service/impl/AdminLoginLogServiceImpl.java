package com.swz.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swz.gmall.ums.entity.AdminLoginLog;
import com.swz.gmall.ums.mapper.AdminLoginLogMapper;
import com.swz.gmall.ums.service.AdminLoginLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户登录日志表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-02
 */
@Service
public class AdminLoginLogServiceImpl extends ServiceImpl<AdminLoginLogMapper, AdminLoginLog> implements AdminLoginLogService {

}
