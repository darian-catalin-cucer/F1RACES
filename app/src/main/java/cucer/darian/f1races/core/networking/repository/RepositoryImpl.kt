package cucer.darian.f1races.core.repository

import android.util.Log
import cucer.darian.f1races.core.networking.API
import cucer.darian.f1races.core.networking.APICallbackInterface
import cucer.darian.f1races.core.repository.models.F1User
import cucer.darian.f1races.utils.Constants
import org.json.JSONObject

class RepositoryImpl(val api: API): Repository {

    private lateinit var selectedUser: F1User
    private val users = arrayListOf<F1User>()

    override suspend fun getUsers(
        query: String,
        callback: Call,
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

    override suspend fun (callback: , errorCallback: ) {
        api.(selectedUser.id, object : APICallbackInterface{
            override fun onSuccess(jsonObject: JSONObject) {
                (jsonObject)
                callback.setItems()
                if (.size == 0) {
                    errorCallback.onError("User didn't .")
                }
            }

            override fun onError(error: String) {
                errorCallback.onError(error)
            }

        })
    }

    private fun (jsonObject: JSONObject) {
        .clear()
        Log.e(javaClass.simpleName, jsonObject.toString())
        val jsonArray = jsonObject.optJSONArray(Constants.DATA)
        jsonArray?.let {
            (0 until it.length()).forEach { i ->
                .add((it.optJSONObject(i)))
            }
        }
    }

    override fun setSelectedUser(user: ) {
        selectedUser = user
    }

    override fun getSelectedUser():   = selectedUser
}