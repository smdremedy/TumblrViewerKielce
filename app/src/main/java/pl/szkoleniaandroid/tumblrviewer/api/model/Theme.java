
package pl.szkoleniaandroid.tumblrviewer.api.model;

import com.squareup.moshi.Json;

public class Theme {

    @Json(name = "header_full_width")
    private Long headerFullWidth;
    @Json(name = "header_full_height")
    private Long headerFullHeight;
    @Json(name = "header_focus_width")
    private Long headerFocusWidth;
    @Json(name = "header_focus_height")
    private Long headerFocusHeight;
    @Json(name = "avatar_shape")
    private String avatarShape;
    @Json(name = "background_color")
    private String backgroundColor;
    @Json(name = "body_font")
    private String bodyFont;
    @Json(name = "header_bounds")
    private String headerBounds;
    @Json(name = "header_image")
    private String headerImage;
    @Json(name = "header_image_focused")
    private String headerImageFocused;
    @Json(name = "header_image_scaled")
    private String headerImageScaled;
    @Json(name = "header_stretch")
    private Boolean headerStretch;
    @Json(name = "link_color")
    private String linkColor;
    @Json(name = "show_avatar")
    private Boolean showAvatar;
    @Json(name = "show_description")
    private Boolean showDescription;
    @Json(name = "show_header_image")
    private Boolean showHeaderImage;
    @Json(name = "show_title")
    private Boolean showTitle;
    @Json(name = "title_color")
    private String titleColor;
    @Json(name = "title_font")
    private String titleFont;
    @Json(name = "title_font_weight")
    private String titleFontWeight;

    public Long getHeaderFullWidth() {
        return headerFullWidth;
    }

    public void setHeaderFullWidth(Long headerFullWidth) {
        this.headerFullWidth = headerFullWidth;
    }

    public Long getHeaderFullHeight() {
        return headerFullHeight;
    }

    public void setHeaderFullHeight(Long headerFullHeight) {
        this.headerFullHeight = headerFullHeight;
    }

    public Long getHeaderFocusWidth() {
        return headerFocusWidth;
    }

    public void setHeaderFocusWidth(Long headerFocusWidth) {
        this.headerFocusWidth = headerFocusWidth;
    }

    public Long getHeaderFocusHeight() {
        return headerFocusHeight;
    }

    public void setHeaderFocusHeight(Long headerFocusHeight) {
        this.headerFocusHeight = headerFocusHeight;
    }

    public String getAvatarShape() {
        return avatarShape;
    }

    public void setAvatarShape(String avatarShape) {
        this.avatarShape = avatarShape;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getBodyFont() {
        return bodyFont;
    }

    public void setBodyFont(String bodyFont) {
        this.bodyFont = bodyFont;
    }

    public String getHeaderBounds() {
        return headerBounds;
    }

    public void setHeaderBounds(String headerBounds) {
        this.headerBounds = headerBounds;
    }

    public String getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(String headerImage) {
        this.headerImage = headerImage;
    }

    public String getHeaderImageFocused() {
        return headerImageFocused;
    }

    public void setHeaderImageFocused(String headerImageFocused) {
        this.headerImageFocused = headerImageFocused;
    }

    public String getHeaderImageScaled() {
        return headerImageScaled;
    }

    public void setHeaderImageScaled(String headerImageScaled) {
        this.headerImageScaled = headerImageScaled;
    }

    public Boolean getHeaderStretch() {
        return headerStretch;
    }

    public void setHeaderStretch(Boolean headerStretch) {
        this.headerStretch = headerStretch;
    }

    public String getLinkColor() {
        return linkColor;
    }

    public void setLinkColor(String linkColor) {
        this.linkColor = linkColor;
    }

    public Boolean getShowAvatar() {
        return showAvatar;
    }

    public void setShowAvatar(Boolean showAvatar) {
        this.showAvatar = showAvatar;
    }

    public Boolean getShowDescription() {
        return showDescription;
    }

    public void setShowDescription(Boolean showDescription) {
        this.showDescription = showDescription;
    }

    public Boolean getShowHeaderImage() {
        return showHeaderImage;
    }

    public void setShowHeaderImage(Boolean showHeaderImage) {
        this.showHeaderImage = showHeaderImage;
    }

    public Boolean getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(Boolean showTitle) {
        this.showTitle = showTitle;
    }

    public String getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(String titleColor) {
        this.titleColor = titleColor;
    }

    public String getTitleFont() {
        return titleFont;
    }

    public void setTitleFont(String titleFont) {
        this.titleFont = titleFont;
    }

    public String getTitleFontWeight() {
        return titleFontWeight;
    }

    public void setTitleFontWeight(String titleFontWeight) {
        this.titleFontWeight = titleFontWeight;
    }

}
