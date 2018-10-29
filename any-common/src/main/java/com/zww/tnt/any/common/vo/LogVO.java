package com.zww.tnt.any.common.vo;

import com.zww.tnt.any.common.entity.SysLog;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zww
 * @date 2017/11/20
 */
@Data
public class LogVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private SysLog sysLog;
    private String username;
}
