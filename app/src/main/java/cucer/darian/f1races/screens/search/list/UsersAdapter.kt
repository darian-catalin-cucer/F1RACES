package cucer.darian.f1races.screens.search.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import cucer.darian.f1races.R
import cucer.darian.f1races.core.repository.models.F1RacesData
import cucer.darian.f1races.core.repository.models.Race
import cucer.darian.f1races.core.repository.models.F1User
import cucer.darian.f1races.screens.details.list.ViewHolder

class UsersAdapter: RecyclerView.Adapter<ViewHolder>(), UsersCallback {

    private lateinit var clickListener: View.OnClickListener
    private lateinit var listener: SelectItem

    private val items = mutableListOf<Race>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_f1_races, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position), listener, clickListener)
    }

    override fun getItemCount(): Int = items.size

    override fun setItems(list: MutableList<Race>) {
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

    private fun getItem(position: Int): F1RacesData = items[position]

    fun addSelectItemListener(listener: SelectItem) {
        this.listener = listener
    }

    fun addSelectItemClickListener(listener: View.OnClickListener) {
        this.clickListener = listener
    }

    interface SelectItem{
        fun select(item: F1RacesData)
    }
}