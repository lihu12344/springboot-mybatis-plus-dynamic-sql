package com.example.demo.dao;

import com.example.demo.pojo.Person;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lihu
 * @since 2020-12-04
 */
public interface PersonMapper extends BaseMapper<Person> {

    Person getByPersonId(Integer id);
    Person getByIdOrName(Integer id,String name);
    List<Person> getByRangeId(List<Integer> list);
    void testUpdate(String name,Integer age);
    Person testString(String name);
    List<Person> testBind(String name);
}
