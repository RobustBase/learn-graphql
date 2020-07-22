package com.robustbase.learn.graphql.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.robustbase.learn.graphql.dao.PostDao;
import com.robustbase.learn.graphql.model.Post;

import java.util.List;

public class Query implements GraphQLQueryResolver {
    private PostDao postDao;

    public Query(PostDao postDao) {
        this.postDao = postDao;
    }

    public List<Post> getRecentPosts(int count, int offset) {
        return postDao.getRecentPosts(count, offset);
    }
}
