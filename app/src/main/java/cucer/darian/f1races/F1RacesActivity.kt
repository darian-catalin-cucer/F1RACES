package cucer.darian.f1races

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import cucer.darian.f1races.models.F1RacesData
import cucer.darian.f1races.networking.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.StringBuilder

//public static final BASE_URL = ""
const val BASE_URL = "https://ergast.com/"
class F1RacesActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f1_races)
        getMyData()
    }

    private fun getMyData() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ApiInterface::class.java)

        val retrofitData = retrofitBuilder.getData()
        //APIImpl().getUser("")
        retrofitData.enqueue(object : Callback<List<F1RacesData>?>{
            override fun onResponse(call: Call<List<F1RacesData>?>, response: Response<List<F1RacesData>?>) {
                val responseBody = response.body()!!

                val myStringBuilder = StringBuilder()
                for(myData in responseBody){
                    myStringBuilder.append("F1RacesData.id")
                    myStringBuilder.append("\n")
                }

                findViewById<TextView>(R.id.txtid).text = myStringBuilder

            }

            override fun onFailure(call: Call<List<F1RacesData>?>, t: Throwable) {
                Log.d("MainActivity", "onFailure:" + t.message)


            }
        })

    }
}