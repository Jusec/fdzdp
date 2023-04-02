package com.jusec.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.jusec.dto.Result;
import com.jusec.pojo.Blog;



/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface IBlogService extends IService<Blog> {

    Result queryHotBlog(Integer current);

    Result queryBlogById(Long id);

    Result likeBlog(Long id);

    Result queryBlogLikes(Long id);

    Result saveBlog(Blog blog);

    Result queryBlogOfFollow(Long max, Integer offset);

}
