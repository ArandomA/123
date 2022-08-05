package com.neimeng.zgl.boot02.mapper;

import com.neimeng.zgl.boot02.domain.Category;
import com.neimeng.zgl.boot02.domain.CategoryVO;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * @author Liyufei
 * @version 1.0
 * @Date 2022/8/3 15:57
 */
public interface CategoryMapper {

   @Select("SELECT * FROM \"categoryInfo\"")
   List<Category> queryCategory();

   @Select("SELECT * FROM \"categoryInfo\"")
   @Results({
           @Result(id = true,property = "id",column = "ID",javaType = String.class),
           @Result(property = "categoryId",column = "categoryId",javaType = String.class
                   ,jdbcType = JdbcType.VARCHAR),
           @Result(property = "clickCount",column = "clickCount",javaType = String.class
                   ,jdbcType = JdbcType.VARCHAR),
           @Result(property = "orderCount",column = "orderCount",javaType = String.class
                   ,jdbcType = JdbcType.VARCHAR),
           @Result(property = "payCount",column = "payCount",javaType = String.class)
   })
   List<CategoryVO> queryCategory01();
}
