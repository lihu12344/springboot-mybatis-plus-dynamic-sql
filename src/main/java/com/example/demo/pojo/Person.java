package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lihu
 * @since 2020-12-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Person extends Model<Person> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    private String name;

    private Integer age;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
