package cucer.darian.f1races.core.networking

import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import cucer.darian.f1races.utils.Constants
import org.json.JSONObject

class F1RACERUserSearchJsonObjectRequest(
    url: String,
    jsonObject: JSONObject?,
    listener: Response.Listener<JSONObject>,
    errorListener: Response.ErrorListener
) : JsonObjectRequest(url, jsonObject, listener, errorListener) {
    override fun getHeaders(): MutableMap<String, String> = HashMap<String, String>().also {
        it["Authorization"] = "Bearer " + Constants
    }
}