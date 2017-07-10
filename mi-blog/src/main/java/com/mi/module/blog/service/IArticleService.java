package com.mi.module.blog.service;

import com.mi.data.vo.ArticleCustom;
import com.mi.data.vo.Pager;
import com.mi.module.blog.entity.Article;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;
import java.util.Map;

/**
 *
 * 文章; InnoDB free: 11264 kB 服务接口
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-09.
 */
public interface IArticleService extends IService<Article> {

    /** 获取归档列表 **/
    List<Map> selectArticleArchiveList();

    /**
     * 初始化分页信息
     * @return
     * @param pager
     */
    void initPage(Pager pager);

    /**
     * 关键字查询文章
     * @param map｛keymap｝ 关键字
     * @return
     */
    List<Article> selectArticleListByKeywords(Map map);

    /**
     * 首页加载文章列表
     * @param pager
     * @return
     */
    List<ArticleCustom> selectArticleList(Pager<Article> pager);

    /**
     * 条件查询文章
     * @param param
     * @return
     */
    List<Article> loadArticle(Map<String, Object> param);
}
