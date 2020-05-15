package com.blogs.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 博客信息返回对象
 *
 * @author wanghongshen
 * @date 2020-05-14
 */
public class MyBlogsVo {
    /**
     * 主键
     */
    private Long id;
    /**
     *博客标题
     */
    private String title;
    /**
     *博客副标题
     */
    private String subhead;
    /**
     *博客内容
     */
    private String content;
    /**
     * 用户id
     */
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
