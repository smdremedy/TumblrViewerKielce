
package pl.szkoleniaandroid.tumblrviewer.api.model;

import com.squareup.moshi.Json;

public class Blog__ {

    @Json(name = "name")
    private String name;
    @Json(name = "active")
    private Boolean active;
    @Json(name = "theme")
    private Theme theme;
    @Json(name = "share_likes")
    private Boolean shareLikes;
    @Json(name = "share_following")
    private Boolean shareFollowing;
    @Json(name = "can_be_followed")
    private Boolean canBeFollowed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public Boolean getShareLikes() {
        return shareLikes;
    }

    public void setShareLikes(Boolean shareLikes) {
        this.shareLikes = shareLikes;
    }

    public Boolean getShareFollowing() {
        return shareFollowing;
    }

    public void setShareFollowing(Boolean shareFollowing) {
        this.shareFollowing = shareFollowing;
    }

    public Boolean getCanBeFollowed() {
        return canBeFollowed;
    }

    public void setCanBeFollowed(Boolean canBeFollowed) {
        this.canBeFollowed = canBeFollowed;
    }

}
