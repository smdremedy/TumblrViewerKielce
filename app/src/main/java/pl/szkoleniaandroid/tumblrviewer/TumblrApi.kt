package pl.szkoleniaandroid.tumblrviewer

import pl.szkoleniaandroid.tumblrviewer.api.model.PostsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TumblrApi {

    @GET("/v2/blog/{url}/posts?api_key=fD0HOvNDa2z10uyozPZNnjeb4fEFGVGm58zttH6cXSe4K0qC64")
    fun getPosts(
        @Path("url") url: String,
        @Query("limit") limit: Int = 20,
        @Query("offset") offset: Int = 0
    ): Call<PostsResponse>
}