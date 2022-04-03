package cucer.darian.f1races.screens.details.list

import cucer.darian.f1races.core.repository.models.F1User
import java.util.ArrayList

interface Callback {
    fun setItems(users: ArrayList<F1User>)
}