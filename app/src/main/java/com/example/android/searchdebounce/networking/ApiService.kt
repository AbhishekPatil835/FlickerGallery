package com.example.android.searchdebounce.networking

import com.example.android.searchdebounce.data.PhotosSearchResponse
import retrofit2.http.GET

interface ApiService {
    @GET("?method=flickr.photos.search&format=json&nojsoncallback=1&text=dogs&api_key=3d50590f0a11979743b112ca10b836cf")
    suspend fun fetchImages(): PhotosSearchResponse
}
