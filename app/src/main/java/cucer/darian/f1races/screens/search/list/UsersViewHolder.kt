package cucer.darian.f1races.screens.search.list

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import cucer.darian.f1races.R
import cucer.darian.f1races.core.repository.models.F1User
import kotlinx.android.synthetic.main.twitter_user_item.view.*

class TwitterUsersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(user: F1User, listener: TwitterUsersAdapter.SelectItem, clickListener: View.OnClickListener) {
        itemView.username.text = itemView.context.resources.getString(R.string.twitter_user, user.name, user.id, user.username)
        itemView.setOnClickListener {
            listener.select(user)
            clickListener.onClick(it)
        }
    }
}