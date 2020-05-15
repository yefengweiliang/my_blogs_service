package com.blogs.service.blogservice;

import com.blogs.entity.pojo.MyBlogs;
import com.blogs.entity.vo.MyBlogsVo;

import java.util.List;

/**
 * 我的博客业务处理层
 *
 * @author wanghongshen
 * @date 2020-05-0-14
 */
public interface BlogsService {
    /**
     * 添加博客
     *
     * @param myBlogs
     * @return
     */
    public Boolean addBlogs(MyBlogs myBlogs);

    /**
     * 修改博客
     *
     * @param myBlogs
     * @return
     */
    public Boolean updateBlogs(MyBlogs myBlogs);

    /**
     * 查询博客
     *
     * @param myBlogs
     * @return
     */
    public List<MyBlogsVo> selectBlogs(MyBlogs myBlogs);

    /**
     * 删除博客
     *
     * @param id
     * @return
     */
    public Boolean deleteBlogs(Long id);
}
