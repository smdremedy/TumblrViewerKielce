
package pl.szkoleniaandroid.tumblrviewer.api.model;

import com.squareup.moshi.Json;

public class Trail {

    @Json(name = "blog")
    private Blog__ blog;
    @Json(name = "post")
    private Post_ post;
    @Json(name = "content_raw")
    private String contentRaw;
    @Json(name = "content")
    private String content;
    @Json(name = "is_current_item")
    private Boolean isCurrentItem;
    @Json(name = "is_root_item")
    private Boolean isRootItem;

    public Blog__ getBlog() {
        return blog;
    }

    public void setBlog(Blog__ blog) {
        this.blog = blog;
    }

    public Post_ getPost() {
        return post;
    }

    public void setPost(Post_ post) {
        this.post = post;
    }

    public String getContentRaw() {
        return contentRaw;
    }

    public void setContentRaw(String contentRaw) {
        this.contentRaw = contentRaw;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getIsCurrentItem() {
        return isCurrentItem;
    }

    public void setIsCurrentItem(Boolean isCurrentItem) {
        this.isCurrentItem = isCurrentItem;
    }

    public Boolean getIsRootItem() {
        return isRootItem;
    }

    public void setIsRootItem(Boolean isRootItem) {
        this.isRootItem = isRootItem;
    }

}
