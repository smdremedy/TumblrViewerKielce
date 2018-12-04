
package pl.szkoleniaandroid.tumblrviewer.api.model;

import com.squareup.moshi.Json;

public class Reblog {

    @Json(name = "comment")
    private String comment;
    @Json(name = "tree_html")
    private String treeHtml;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTreeHtml() {
        return treeHtml;
    }

    public void setTreeHtml(String treeHtml) {
        this.treeHtml = treeHtml;
    }

}
