package cucer.darian.f1races.screens.details.list

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import cucer.darian.f1races.core.repository.models.F1RacesData
import kotlinx.android.synthetic.main.simple_item.view.*

class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(item: F1RacesData) {
        itemView.text.text = item.text
    }
}
