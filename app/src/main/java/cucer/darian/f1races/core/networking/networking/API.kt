package cucer.darian.f1races.core.networking.networking

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit

interface Api {

    companion object {
        const val BASE_URL = "https://ergast.com/api/f1/drivers/alonso/circuits/monza/races.json"
    }

    @GET(BASE_URL)
    fun getUser(@Path("username") username: String)

    @GET("location/{}")
    fun groupList(@Path("id") id: Int, @Query("sort") sort: String)
}

class APIImpl: Api {

    override fun getUser(username: String) {
        TODO("Not yet implemented")
    }

    override fun groupList(id: Int, sort: String) {
        TODO("Not yet implemented")
    }
}