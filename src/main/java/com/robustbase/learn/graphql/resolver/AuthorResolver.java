package com.robustbase.learn.graphql.resolver;

import com.robustbase.learn.graphql.dao.PostDao;
import com.robustbase.learn.graphql.model.Author;
import com.robustbase.learn.graphql.model.Post;

import java.util.List;

public class AuthorResolver {
    private PostDao postDao;

    public AuthorResolver(PostDao postDao) {
        this.postDao = postDao;
    }

    public List<Post> getPosts(Author author) {
        return postDao.getAuthorPosts(author.getId());
    }
}
