package com.springboot.mapper;

import com.springboot.bean.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface StudentMapper {

    @Insert("insert into student(id,user_name,sex) values(#{id},#{userName},#{sex})")
    int add(Student student);
    @Update("update student set user_name=#{userName},sex=#{sex} where id=#{id}")
    int update(Student student);
    @Delete("delete from student where id=#{id}")
    int delete(Integer id);
    @Select("select * from student where id=#{id}")
    @Results(id = "student",value = {
            @Result(property = "id",column = "id",javaType = Integer.class),
            @Result(property = "userName",column = "user_name",javaType = String.class),
            @Result(property = "sex",column = "sex",javaType = String.class)
    })
    Student queryStudentById(Integer id);
}
