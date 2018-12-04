
package pl.szkoleniaandroid.tumblrviewer.api.model;

import com.squareup.moshi.Json;

public class Links {

    @Json(name = "next")
    private Next next;

    public Next getNext() {
        return next;
    }

    public void setNext(Next next) {
        this.next = next;
    }

}
