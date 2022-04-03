package cucer.darian.f1races.core.repository

import android.util.Log
import cucer.darian.f1races.core.networking.API
import cucer.darian.f1races.core.networking.APICallbackInterface
import cucer.darian.f1races.core.networking.error.ErrorCallback
import cucer.darian.f1races.core.repository.models.F1RacesData
import cucer.darian.f1races.core.repository.models.F1User
import cucer.darian.f1races.core.repository.models.Race
import cucer.darian.f1races.screens.search.list.Callback
import cucer.darian.f1races.utils.Constants
import org.json.JSONObject

class RepositoryImpl(val api: API): Repository {

    private lateinit var selectedUser: F1RacesData
    private val users = arrayListOf<F1User>()
    private val users = arrayListOf<Race>()

    override suspend fun getUsers(
        query: String,
        callback: Callback,
        errorCallback: ErrorCallback
    ) {
        api.getUser(query, object : APICallbackInterface{
            override fun onSuccess(jsonObject: JSONObject) {
                parseUsersResponse(jsonObject)
                callback.setItems(users)
                if (users.size == 0) {
                    errorCallback.onError("No users found!")
                } else {
                    errorCallback.onError("")
                }
            }

            override fun onError(error: String) {
                errorCallback.onError(error)
            }

        })
    }

    private fun parseUsersResponse(jsonObject: JSONObject) {
        users.clear()
        Log.e(javaClass.simpleName, jsonObject.toString())
        val jsonArray = jsonObject.optJSONArray(Constants.DATA)
        jsonArray?.let {
            (0 until it.length()).forEach { i ->
                users.add((it.optJSONObject(i)))
            }
        }
    }

    override suspend fun getUser(callback: Callback, errorCallback: ErrorCallback) {
        api.getUser(selectedUser.id, object : APICallbackInterface{
            override fun onSuccess(jsonObject: JSONObject) {
                (jsonObject)
                callback.setItems()
            }

        })
    }

    private fun (jsonObject: JSONObject) {
        users.clear()
        Log.e(javaClass.simpleName, jsonObject.toString())
        val jsonArray = jsonObject.optJSONArray(Constants.DATA)
        jsonArray?.let {
            (0 until it.length()).forEach { i ->
                users.add((it.optJSONObject(i)))
            }
        }
    }

    override fun setSelectedUser(user: F1RacesData) {
        selectedUser = user
    }

    override fun getSelectedUser(): selectedUser {}
}