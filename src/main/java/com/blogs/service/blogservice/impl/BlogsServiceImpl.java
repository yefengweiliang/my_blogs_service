package com.blogs.service.blogservice.impl;

import com.blogs.dao.BlogsMapper;
import com.blogs.entity.pojo.MyBlogs;
import com.blogs.entity.vo.MyBlogsVo;
import com.blogs.service.blogservice.BlogsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 博客业务处理实现类
 *
 * @author wanghongshen
 * @date 2020-05-14
 */
@Slf4j
@Service
public class BlogsServiceImpl implements BlogsService {

    @Autowired
    private BlogsMapper blogsMapper;

    @Override
    public Boolean addBlogs(MyBlogs myBlogs) {
        log.info("方法addBlogs添加博客, 参数为:{}", myBlogs.toString());
        Boolean result = blogsMapper.addBlogs(myBlogs);
        log.info("处理结果为:{}", result);
        return result;
    }

    @Override
    public Boolean updateBlogs(MyBlogs myBlogs) {
        log.info("方法updateBlogs修改博客, 参数为:{}", myBlogs.toString());
        Boolean result = blogsMapper.updateBlogs(myBlogs);
        log.info("处理结果为:{}", result);
        return result;
    }

    @Override
    public List<MyBlogsVo> selectBlogs(MyBlogs myBlogs) {
        log.info("方法selectBlogs查询博客, 参数为:{}", myBlogs.toString());
        List<MyBlogsVo> result = blogsMapper.getBlogs(myBlogs);
        log.info("处理结果为:{}", result.toString());
        return result;
    }

    @Override
    public Boolean deleteBlogs(Long id) {
        log.info("方法deleteBlogs删除博客, 参数为:{}", id);
        Boolean result = blogsMapper.deleteBlogsById(id);
        log.info("处理结果为:{}", result);
        return result;
    }
}
