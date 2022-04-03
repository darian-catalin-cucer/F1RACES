package cucer.darian.f1races.screens.details.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cucer.darian.f1races.R
import cucer.darian.f1races.core.repository.models.F1RacesData

abstract class Adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>(), Callback {

    private val items = mutableListOf<F1RacesData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.simple_item, parent, false))

    override fun getItemCount(): Int = items.size

    private fun getItem(position: Int): F1RacesData = items[position]
}