package com.fs.mapper;

import com.fs.model.Person;
import org.apache.ibatis.annotations.Select;

public interface PersonMapper {
    int deleteByPrimaryKey(String personId);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(String personId);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
    @Select("select person_id as personId,person_name as personName,person_password as personPassword from person where person_name = #{username}")
    Person queryPersonByPersonName(String username);
}