
package pl.szkoleniaandroid.tumblrviewer.api.model;

import com.squareup.moshi.Json;

public class Blog {

    @Json(name = "ask")
    private Boolean ask;
    @Json(name = "ask_anon")
    private Boolean askAnon;
    @Json(name = "ask_page_title")
    private String askPageTitle;
    @Json(name = "can_subscribe")
    private Boolean canSubscribe;
    @Json(name = "description")
    private String description;
    @Json(name = "is_nsfw")
    private Boolean isNsfw;
    @Json(name = "name")
    private String name;
    @Json(name = "posts")
    private Long posts;
    @Json(name = "share_likes")
    private Boolean shareLikes;
    @Json(name = "subscribed")
    private Boolean subscribed;
    @Json(name = "title")
    private String title;
    @Json(name = "total_posts")
    private Long totalPosts;
    @Json(name = "updated")
    private Long updated;
    @Json(name = "url")
    private String url;
    @Json(name = "uuid")
    private String uuid;
    @Json(name = "is_optout_ads")
    private Boolean isOptoutAds;

    public Boolean getAsk() {
        return ask;
    }

    public void setAsk(Boolean ask) {
        this.ask = ask;
    }

    public Boolean getAskAnon() {
        return askAnon;
    }

    public void setAskAnon(Boolean askAnon) {
        this.askAnon = askAnon;
    }

    public String getAskPageTitle() {
        return askPageTitle;
    }

    public void setAskPageTitle(String askPageTitle) {
        this.askPageTitle = askPageTitle;
    }

    public Boolean getCanSubscribe() {
        return canSubscribe;
    }

    public void setCanSubscribe(Boolean canSubscribe) {
        this.canSubscribe = canSubscribe;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsNsfw() {
        return isNsfw;
    }

    public void setIsNsfw(Boolean isNsfw) {
        this.isNsfw = isNsfw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPosts() {
        return posts;
    }

    public void setPosts(Long posts) {
        this.posts = posts;
    }

    public Boolean getShareLikes() {
        return shareLikes;
    }

    public void setShareLikes(Boolean shareLikes) {
        this.shareLikes = shareLikes;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTotalPosts() {
        return totalPosts;
    }

    public void setTotalPosts(Long totalPosts) {
        this.totalPosts = totalPosts;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Boolean getIsOptoutAds() {
        return isOptoutAds;
    }

    public void setIsOptoutAds(Boolean isOptoutAds) {
        this.isOptoutAds = isOptoutAds;
    }

}
