
package pl.szkoleniaandroid.tumblrviewer.api.model;

import com.squareup.moshi.Json;

public class Exif {

    @Json(name = "Camera")
    private String camera;
    @Json(name = "ISO")
    private Long iSO;
    @Json(name = "Aperture")
    private String aperture;
    @Json(name = "Exposure")
    private String exposure;
    @Json(name = "FocalLength")
    private String focalLength;

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public Long getISO() {
        return iSO;
    }

    public void setISO(Long iSO) {
        this.iSO = iSO;
    }

    public String getAperture() {
        return aperture;
    }

    public void setAperture(String aperture) {
        this.aperture = aperture;
    }

    public String getExposure() {
        return exposure;
    }

    public void setExposure(String exposure) {
        this.exposure = exposure;
    }

    public String getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(String focalLength) {
        this.focalLength = focalLength;
    }

}
