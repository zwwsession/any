package com.zww.tnt.any.admin.model.dto;

import com.zww.tnt.any.admin.model.entity.SysUser;
import lombok.Data;

import java.util.List;

/**
 * @author zww
 * @date 2017/11/5
 */
@Data
public class UserDTO extends SysUser {
    /**
     * 角色ID
     */
    private List<Integer> role;

    private Integer deptId;

    /**
     * 新密码
     */
    private String newpassword1;
}
