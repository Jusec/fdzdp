package com.jusec.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.jusec.blog.mapper.BlogCommentsMapper;
import com.jusec.blog.service.IBlogCommentsService;
import com.jusec.pojo.BlogComments;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *

 */
@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
