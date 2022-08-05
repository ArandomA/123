package com.neimeng.zgl.boot02.service;

import com.neimeng.zgl.boot02.domain.Category;
import com.neimeng.zgl.boot02.domain.CategoryVO;
import com.neimeng.zgl.boot02.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Liyufei
 * @version 1.0
 * @Date 2022/8/3 17:12
 */
@Service
public class CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    public List<CategoryVO> queryAllCategory(){
        List<CategoryVO> listv = new ArrayList<>();
        List<Category> list = categoryMapper.queryCategory();
        for (Category category: list) {
            CategoryVO categoryVO = new CategoryVO();
            categoryVO.setCategoryId(category.getCategoryId());
            categoryVO.setClickCount(category.getClickCount().trim());
            categoryVO.setOrderCount(category.getOrderCount().trim());
            categoryVO.setPayCount(category.getPayCount().trim());
            listv.add(categoryVO);
        }
        return listv;
    }

    public List<CategoryVO> queryAllCategory01(){
        return categoryMapper.queryCategory01();
    }
}
