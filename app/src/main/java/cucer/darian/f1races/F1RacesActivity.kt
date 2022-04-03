package cucer.darian.f1races

import android.os.Bundle
import com.android.volley.Request

import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest

//public static final BASE_URL = ""
const val BASE_URL = "https://ergast.com/"
class F1RacesActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f1_races)
        setSupportActionBar(toolbar)

        //Make a string request

            val stringRequirest = StringRequest {
                Request.Method.GET,
                "http://ergast.com/api/f1/drivers.json?callback=myParser"
                Response Listener ()
                //

            },
        Response.ErrorListener {volleyError->
            // Volley Error, if any

            }
    }