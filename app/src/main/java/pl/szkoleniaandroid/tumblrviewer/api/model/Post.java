
package pl.szkoleniaandroid.tumblrviewer.api.model;

import java.util.List;
import com.squareup.moshi.Json;

public class Post {

    @Json(name = "type")
    private String type;
    @Json(name = "blog_name")
    private String blogName;
    @Json(name = "blog")
    private Blog_ blog;
    @Json(name = "id")
    private Long id;
    @Json(name = "post_url")
    private String postUrl;
    @Json(name = "slug")
    private String slug;
    @Json(name = "date")
    private String date;
    @Json(name = "timestamp")
    private Long timestamp;
    @Json(name = "state")
    private String state;
    @Json(name = "format")
    private String format;
    @Json(name = "reblog_key")
    private String reblogKey;
    @Json(name = "tags")
    private List<String> tags = null;
    @Json(name = "short_url")
    private String shortUrl;
    @Json(name = "summary")
    private String summary;
    @Json(name = "is_blocks_post_format")
    private Boolean isBlocksPostFormat;
    @Json(name = "recommended_source")
    private Object recommendedSource;
    @Json(name = "recommended_color")
    private Object recommendedColor;
    @Json(name = "post_author")
    private String postAuthor;
    @Json(name = "bookmarklet")
    private Boolean bookmarklet;
    @Json(name = "note_count")
    private Long noteCount;
    @Json(name = "source_url")
    private String sourceUrl;
    @Json(name = "source_title")
    private String sourceTitle;
    @Json(name = "caption")
    private String caption;
    @Json(name = "reblog")
    private Reblog reblog;
    @Json(name = "trail")
    private List<Trail> trail = null;
    @Json(name = "link_url")
    private String linkUrl;
    @Json(name = "image_permalink")
    private String imagePermalink;
    @Json(name = "photos")
    private List<Photo> photos = null;
    @Json(name = "can_like")
    private Boolean canLike;
    @Json(name = "can_reblog")
    private Boolean canReblog;
    @Json(name = "can_send_in_message")
    private Boolean canSendInMessage;
    @Json(name = "can_reply")
    private Boolean canReply;
    @Json(name = "display_avatar")
    private Boolean displayAvatar;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public Blog_ getBlog() {
        return blog;
    }

    public void setBlog(Blog_ blog) {
        this.blog = blog;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getReblogKey() {
        return reblogKey;
    }

    public void setReblogKey(String reblogKey) {
        this.reblogKey = reblogKey;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Boolean getIsBlocksPostFormat() {
        return isBlocksPostFormat;
    }

    public void setIsBlocksPostFormat(Boolean isBlocksPostFormat) {
        this.isBlocksPostFormat = isBlocksPostFormat;
    }

    public Object getRecommendedSource() {
        return recommendedSource;
    }

    public void setRecommendedSource(Object recommendedSource) {
        this.recommendedSource = recommendedSource;
    }

    public Object getRecommendedColor() {
        return recommendedColor;
    }

    public void setRecommendedColor(Object recommendedColor) {
        this.recommendedColor = recommendedColor;
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    public Boolean getBookmarklet() {
        return bookmarklet;
    }

    public void setBookmarklet(Boolean bookmarklet) {
        this.bookmarklet = bookmarklet;
    }

    public Long getNoteCount() {
        return noteCount;
    }

    public void setNoteCount(Long noteCount) {
        this.noteCount = noteCount;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getSourceTitle() {
        return sourceTitle;
    }

    public void setSourceTitle(String sourceTitle) {
        this.sourceTitle = sourceTitle;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Reblog getReblog() {
        return reblog;
    }

    public void setReblog(Reblog reblog) {
        this.reblog = reblog;
    }

    public List<Trail> getTrail() {
        return trail;
    }

    public void setTrail(List<Trail> trail) {
        this.trail = trail;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getImagePermalink() {
        return imagePermalink;
    }

    public void setImagePermalink(String imagePermalink) {
        this.imagePermalink = imagePermalink;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Boolean getCanLike() {
        return canLike;
    }

    public void setCanLike(Boolean canLike) {
        this.canLike = canLike;
    }

    public Boolean getCanReblog() {
        return canReblog;
    }

    public void setCanReblog(Boolean canReblog) {
        this.canReblog = canReblog;
    }

    public Boolean getCanSendInMessage() {
        return canSendInMessage;
    }

    public void setCanSendInMessage(Boolean canSendInMessage) {
        this.canSendInMessage = canSendInMessage;
    }

    public Boolean getCanReply() {
        return canReply;
    }

    public void setCanReply(Boolean canReply) {
        this.canReply = canReply;
    }

    public Boolean getDisplayAvatar() {
        return displayAvatar;
    }

    public void setDisplayAvatar(Boolean displayAvatar) {
        this.displayAvatar = displayAvatar;
    }

}
