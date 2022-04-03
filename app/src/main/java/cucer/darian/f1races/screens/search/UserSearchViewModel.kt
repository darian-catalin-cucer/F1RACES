package cucer.darian.f1races.screens.search

import android.util.Log
import android.widget.Adapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.Navigation
import cucer.darian.f1races.core.repository.Repository
import cucer.darian.f1races.R
import cucer.darian.f1races.core.networking.networking.error.ErrorCallback
import cucer.darian.f1races.core.repository.Repository
import cucer.darian.f1races.core.repository.models.F1User
import cucer.darian.f1races.screens.search.list.TwitterUsersAdapter
import kotlinx.coroutines.launch

class UserSearchViewModel(private val repository: Repository): ViewModel() {

    val errorText = MutableLiveData<String>()
    val adapter = Adapter().also { adapter ->
        adapter.addSelectItemListener(object : Adapter.SelectItem {
            override fun select(item: F1User) {
                repository.setSelectedUser(item)
            }
        })
        adapter.addSelectItemClickListener{
            Log.e(javaClass.simpleName, " Go To Details ")
            Navigation.findNavController(it).navigate(R.id.go_to_details)
        }
    }

    fun onTextChanged(text: String) {
        Log.e(javaClass.simpleName, text)
        if (text.length > 2) {
            errorText.postValue("")
            viewModelScope.launch {
                repository.getUsers(text, adapter, object: ErrorCallback{
                    override fun onError(error: String) {
                        errorText.postValue(error)
                    }
                })
            }
        }
    }
}