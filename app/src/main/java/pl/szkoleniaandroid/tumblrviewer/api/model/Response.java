
package pl.szkoleniaandroid.tumblrviewer.api.model;

import java.util.List;
import com.squareup.moshi.Json;

public class Response {

    @Json(name = "blog")
    private Blog blog;
    @Json(name = "posts")
    private List<Post> posts = null;
    @Json(name = "total_posts")
    private Long totalPosts;
    @Json(name = "_links")
    private Links links;

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Long getTotalPosts() {
        return totalPosts;
    }

    public void setTotalPosts(Long totalPosts) {
        this.totalPosts = totalPosts;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

}
