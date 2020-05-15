package com.blogs.controller;

import com.blogs.common.enums.RespCodeEnum;
import com.blogs.common.utils.CommonUtil;
import com.blogs.entity.pojo.MyBlogs;
import com.blogs.entity.pojo.UserInfo;
import com.blogs.entity.validator.First;
import com.blogs.entity.vo.MyBlogsVo;
import com.blogs.entity.vo.RespInfo;
import com.blogs.feign.UserAuthFeignClient;
import com.blogs.service.blogservice.BlogsService;
import com.utils.exception.ParamException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 博客控制类
 *
 * @author wanghongshen
 * @date 2020-05-14
 */
@Slf4j
@RestController
public class BlogsController {

    @Autowired
    private BlogsService blogsService;

    @Autowired
    private UserAuthFeignClient userAuthFeignClient;


    @PostMapping(value = "/getBlogs/{userId}")
    public Object getBlogs(MyBlogs myBlogs){
        List<MyBlogsVo> result = blogsService.selectBlogs(myBlogs);
        return RespCodeEnum.RespObject.success(result);
    }

    @PostMapping(value = "/addBlogs")
    public Object addBlogs(@Validated({First.class}) MyBlogs myBlogs, BindingResult bindingResult){
        Boolean result = false;
        try{
            //打印校验结果
            CommonUtil.validLog(bindingResult);
            result = blogsService.addBlogs(myBlogs);

            if(result){
                return RespCodeEnum.RespObject.success(result);
            } else {
                return RespCodeEnum.RespObject.internalException();
            }
        } catch (ParamException e) {
            return RespCodeEnum.RespObject.missingParam();
        }

    }

}
