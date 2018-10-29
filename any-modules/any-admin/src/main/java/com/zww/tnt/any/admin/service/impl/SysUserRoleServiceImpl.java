package com.zww.tnt.any.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zww.tnt.any.admin.mapper.SysUserRoleMapper;
import com.zww.tnt.any.admin.model.entity.SysUserRole;
import com.zww.tnt.any.admin.service.SysUserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色表 服务实现类
 * </p>
 *
 * @author zww
 * @since 2017-10-29
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {

    /**
     * 根据用户Id删除该用户的角色关系
     *
     * @param userId 用户ID
     * @return boolean
     */
    @Override
    public Boolean deleteByUserId(Integer userId) {
        return baseMapper.deleteByUserId(userId);
    }
}
