package com.hr.mapper;


import com.hr.entity.SysLog;
import org.springframework.stereotype.Repository;

/**
 * @author : kaifa
 * create at:  2019-10-22  17:30
 * @description: log mapper接口
 */
@Repository
public interface LogMapper {
    /**
     * 切面保存日志
     * @param sysLog
     * @return
     */
    public int saveLog(SysLog sysLog);
}