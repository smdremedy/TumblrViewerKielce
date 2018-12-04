
package pl.szkoleniaandroid.tumblrviewer.api.model;

import com.squareup.moshi.Json;

public class OriginalSize {

    @Json(name = "url")
    private String url;
    @Json(name = "width")
    private Long width;
    @Json(name = "height")
    private Long height;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

}
