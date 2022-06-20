package com.jiaolin.boot.maper;

import com.jiaolin.boot.entity.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author johnny
 * @Classname DepartmentMapper
 * @Description
 * @Date 2022/5/18 14:04
 */
public interface DepartmentMapper {
    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
