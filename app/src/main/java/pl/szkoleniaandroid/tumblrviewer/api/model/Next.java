
package pl.szkoleniaandroid.tumblrviewer.api.model;

import com.squareup.moshi.Json;

public class Next {

    @Json(name = "href")
    private String href;
    @Json(name = "method")
    private String method;
    @Json(name = "query_params")
    private QueryParams queryParams;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public QueryParams getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(QueryParams queryParams) {
        this.queryParams = queryParams;
    }

}
