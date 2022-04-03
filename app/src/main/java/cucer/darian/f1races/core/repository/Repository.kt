package cucer.darian.f1races.core.repository

import cucer.darian.f1races.core.networking.error.ErrorCallback
import cucer.darian.f1races.screens.search.list.Callback

interface Repository {

    //API calls functions
    suspend fun getUsers(query: String, callback: Callback, errorCallback: ErrorCallback)
    suspend fun getUsers(callback: Callback, errorCallback: ErrorCallback)

    //select user function
    fun setSelectedUser(user: F1RacesData)
    fun getSelectedUser(): F1RacesData
}