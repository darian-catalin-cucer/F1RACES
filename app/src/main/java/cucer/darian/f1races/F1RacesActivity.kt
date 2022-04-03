package cucer.darian.f1races

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import cucer.darian.f1races.core.networking.repository.models.F1RacesData
import cucer.darian.f1races.core.networking.networking.ApiInterface
import java.lang.StringBuilder

//public static final BASE_URL = ""
const val BASE_URL = "https://ergast.com/"
class F1RacesActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f1_races)
        getMyData()
    }

                findViewById<TextView>(R.id.txtid).text = myStringBuilder

            }

            override fun onFailure(call: Call<List<F1RacesData>?>, t: Throwable) {
                Log.d("MainActivity", "onFailure:" + t.message)


            }
        })

    }
}