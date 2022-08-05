package com.neimeng.zgl.boot02.service;

import com.neimeng.zgl.boot02.domain.CategroySession;
import com.neimeng.zgl.boot02.domain.CategroySessionVO;
import com.neimeng.zgl.boot02.mapper.CategroySessionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class CategorySessionService {

    @Resource
    private CategroySessionMapper categroySessionMapper;

    public List<CategroySessionVO> findCategorySession(){
        List<CategroySession> list = categroySessionMapper.queryCategorySession();
        List<CategroySessionVO> result = this.convert_session(list);
        return result;
    }

    public List<CategroySessionVO> convert_session(List<CategroySession> list){
        List<CategroySessionVO> ss = new ArrayList<>();
        List<Long> ids = null;
        for (CategroySession cs:list) {
            for(CategroySession sc:list){
                if(cs.getCategoryId()==sc.getCategoryId()){
                    if(ids==null){
                        ids = new ArrayList<>();
                    }
                    ids.add(sc.getCount());
                    if(ids.size()==10){
                       CategroySessionVO csvo = new CategroySessionVO();
                       csvo.setCategoryId(sc.getCategoryId());
                       csvo.setSession_count(ids);
                       ss.add(csvo);
                       if(ids!=null) ids = null;
                    }
                }
            }
        }
     return ss;
    }
}
