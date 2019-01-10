package com.qfedu.service;

import com.qfedu.vo.ResultVo;

public interface IndexListTwoService {
    //主页自动展示所有数据
    ResultVo findMenuInfoTwo(Integer id );
    //烘培
    ResultVo findBake(String title );
    //素食主义
    ResultVo findVegetarianism(String title);
    //煲汤
    ResultVo findCookSoup (String title );
    //本周佳作
    ResultVo findMerit (String title);
    //首页顶部搜索框，模糊查询
    ResultVo findMenuInfoByTitle(String title);
}