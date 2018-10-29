package com.zww.tnt.any.admin.model.dto;

import com.zww.tnt.any.common.vo.SysRole;
import lombok.Data;

/**
 * @author zww
 * @date 2018/1/20
 * 角色Dto
 */
@Data
public class RoleDTO extends SysRole {
    /**
     * 角色部门Id
     */
    private Integer roleDeptId;

    /**
     * 部门名称
     */
    private String deptName;
}
