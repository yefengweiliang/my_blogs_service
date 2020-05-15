package com.blogs.dao;

import com.blogs.entity.pojo.MyBlogs;
import com.blogs.entity.vo.MyBlogsVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 博客处理接口
 *
 * @author wanghongshen
 * @date 2020-05-14
 */
@Mapper
@Repository
public interface BlogsMapper {
    /**
     * 添加博客
     * @param myblogs
     * @return
     */
    Boolean addBlogs(MyBlogs myblogs);

    /**
     * 修改博客
     * @param myblogs
     * @return
     */
    Boolean updateBlogs(MyBlogs myblogs);

    /**
     * 查询博客
     * @param myblogs
     * @return
     */
    List<MyBlogsVo> getBlogs(MyBlogs myblogs);

    /**
     * 删除博客
     * @param id
     * @return
     */
    Boolean deleteBlogsById(Long id);

}
