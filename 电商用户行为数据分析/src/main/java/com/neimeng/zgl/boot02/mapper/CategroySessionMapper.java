package com.neimeng.zgl.boot02.mapper;

import com.neimeng.zgl.boot02.domain.CategroySession;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CategroySessionMapper {

    @Select("SELECT * FROM \"categorySessionInfo\"")
    List<CategroySession> queryCategorySession();
}
