package cucer.darian.f1races.screens.search.list

import android.view.View
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import cucer.darian.f1races.R
import cucer.darian.f1races.core.repository.models.F1User
import kotlinx.android.synthetic.main.simple_item.view.*

class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(user: F1User, listener: Adapter.SelectItem, clickListener: View.OnClickListener) {
        itemView.username.text = itemView.context.resources.getString(R.string.f1_races, user.name, user.id, user.username)
        itemView.setOnClickListener {
            listener.select(user)
            clickListener.onClick(it)
        }
    }
}