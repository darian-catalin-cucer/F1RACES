package cucer.darian.f1races.networking

import cucer.darian.f1races.models.F1RacesData
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("api/f1/drivers/alonso/circuits/monza/races")
    fun getData(): Call<List<F1RacesData>>
}