package com.jiaolin.boot.maper;

import com.jiaolin.boot.entity.Employee;
import org.apache.ibatis.annotations.Param;

/**
 * @author johnny
 * @Classname EmpMapper
 * @Description
 * @Date 2022/5/18 15:45
 */
public interface EmpMapper {

    public Employee getEmployeeById(@Param("id") Integer id);
}
