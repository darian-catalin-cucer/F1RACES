package cucer.darian.f1races.screens.details

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cucer.darian.f1races.core.networking.error.ErrorCallback
import cucer.darian.f1races.core.repository.Repository
import cucer.darian.f1races.screens.search.list.UsersAdapter
import kotlinx.coroutines.launch

class UserDetailsViewModel(val repository: Repository): ViewModel() {

    val adapter = UsersAdapter()
    val errorText = MutableLiveData<String>()

    fun getUsername(): String = repository.getSelectedUser().username
    fun load() {
        viewModelScope.launch {
            repository.getUsers(adapter, object : ErrorCallback {
                override fun onError(error: String) {
                    errorText.postValue(error)
                }
            })
        }
    }
}