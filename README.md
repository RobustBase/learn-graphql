## Access GraphQL client
URL: http://localhost:8080/graphql
Method: POST

```
query {
    recentPosts(count: 10, offset: 0) {
        id
        title
        category
        author {
            id
            name
            thumbnail
        }
    }
}
```
