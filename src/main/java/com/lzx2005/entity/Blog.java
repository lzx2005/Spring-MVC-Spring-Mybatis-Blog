package com.lzx2005.entity;

import java.util.Date;

/**
 * Created by Administrator on 2016/6/19.
 */
public class Blog {
    private long blogId;
    private String title;
    private String content;
    private Date createTime;
    private long view;
    private short blogType;

    public long getBlogId() {
        return blogId;
    }

    public void setBlogId(long blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public long getView() {
        return view;
    }

    public void setView(long view) {
        this.view = view;
    }

    public short getBlogType() {
        return blogType;
    }

    public void setBlogType(short blogType) {
        this.blogType = blogType;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", view=" + view +
                ", blogType=" + blogType +
                '}';
    }
}
