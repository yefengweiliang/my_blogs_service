package com.blogs.entity.pojo;

import com.blogs.entity.validator.First;
import com.blogs.entity.validator.Second;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.utils.pojo.PageVo;

import javax.validation.constraints.NotNull;

/**
 * 我的博客信息
 *
 * @author wanghongshen
 * @date 2020-05-14
 */
public class MyBlogs  extends PageVo {
    /**
     * 主键
     */
    @NotNull(groups = { Second.class }, message = "主键id不能为空")
    private Long id;
    /**
     *博客标题
     */
    @NotNull(groups = { First.class }, message = "标题不能为空")
    private String title;
    /**
     *博客副标题
     */
    private String subhead;
    /**
     *博客内容
     */
    @NotNull(groups = { First.class }, message = "内容不能为空")
    private String content;
    /**
     * 用户id
     */
    @NotNull(groups = { First.class }, message = "用户不能为空")
    private Long userId;
    /**
     *修改时间
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private String updteTime;
    /**
     *创建时间
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private String createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubhead() {
        return subhead;
    }

    public void setSubhead(String subhead) {
        this.subhead = subhead;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUpdteTime() {
        return updteTime;
    }

    public void setUpdteTime(String updteTime) {
        this.updteTime = updteTime;
    }

    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "MyBlogs{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subhead='" + subhead + '\'' +
                ", content='" + content + '\'' +
                ", userId='" + userId + '\'' +
                ", updteTime='" + updteTime + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
