
package pl.szkoleniaandroid.tumblrviewer.api.model;

import com.squareup.moshi.Json;

public class QueryParams {

    @Json(name = "limit")
    private String limit;
    @Json(name = "offset")
    private String offset;
    @Json(name = "page_number")
    private String pageNumber;

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

}
