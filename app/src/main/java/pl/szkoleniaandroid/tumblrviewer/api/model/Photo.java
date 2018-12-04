
package pl.szkoleniaandroid.tumblrviewer.api.model;

import java.util.List;
import com.squareup.moshi.Json;

public class Photo {

    @Json(name = "caption")
    private String caption;
    @Json(name = "original_size")
    private OriginalSize originalSize;
    @Json(name = "alt_sizes")
    private List<AltSize> altSizes = null;
    @Json(name = "exif")
    private Exif exif;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public OriginalSize getOriginalSize() {
        return originalSize;
    }

    public void setOriginalSize(OriginalSize originalSize) {
        this.originalSize = originalSize;
    }

    public List<AltSize> getAltSizes() {
        return altSizes;
    }

    public void setAltSizes(List<AltSize> altSizes) {
        this.altSizes = altSizes;
    }

    public Exif getExif() {
        return exif;
    }

    public void setExif(Exif exif) {
        this.exif = exif;
    }

}
