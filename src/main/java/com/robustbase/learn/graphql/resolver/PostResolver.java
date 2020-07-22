package com.robustbase.learn.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.robustbase.learn.graphql.dao.AuthorDao;
import com.robustbase.learn.graphql.model.Author;
import com.robustbase.learn.graphql.model.Post;

public class PostResolver implements GraphQLResolver<Post> {
    private AuthorDao authorDao;

    public PostResolver(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    public Author getAuthor(Post post) {
        return authorDao.getAuthor(post.getAuthorId()).orElse(null);
    }
}
