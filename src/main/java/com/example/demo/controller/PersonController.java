package com.example.demo.controller;


import com.example.demo.dao.PersonMapper;
import com.example.demo.pojo.Person;
import com.example.demo.service.PersonService;
import io.swagger.models.auth.In;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lihu
 * @since 2020-12-04
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Resource
    private PersonMapper personMapper;

    @Resource
    private PersonService personService;

    @RequestMapping("/save")
    public String save(){
        for (int i=0;i<10;i++){
            Person person=new Person();
            person.setId(i+40);
            person.setName("瓜田李下 "+i);
            person.setAge(i+10);

            personMapper.insert(person);
        }

        return "success";
    }

    @RequestMapping("/get")
    public Person get(Integer id){
        return personMapper.getByPersonId(id);
    }

    @RequestMapping("/get2")
    public Person get2(Integer id,String name){
        return personMapper.getByIdOrName(id,name);
    }

    @RequestMapping("/get3")
    public List<Person> get3(){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        return personMapper.getByRangeId(list);
    }

    @RequestMapping("/get4")
    public Person testUpdate(String name,Integer age){
        System.out.println(personMapper.selectById(1));
        personMapper.testUpdate(name,age);
        System.out.println(personMapper.selectById(1));

        return personMapper.selectById(1);
    }

    @RequestMapping("/get5")
    public Person testString(String name){
        return personMapper.testString(name);
    }

    @RequestMapping("/get6")
    public List<Person> testBind(String name){
        return personMapper.testBind(name);
    }
}

