package cucer.darian.f1races.screens.search

import android.os.Bundle
import android.view.View
import cucer.darian.f1races.R
import cucer.darian.f1races.core.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_user_search.*
import org.koin.core.inject
import cucer.darian.f1races.databinding.FragmentUserSearchBinding as FragmentUserSearchBinding1

class UserSearchFragment: BaseFragment<UserSearchViewModel, FragmentUserSearchBinding1>() {

    override val viewModel: UserSearchViewModel by inject()

    override fun whichLayout(): Int = R.layout.fragment_user_search

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        username_input_edit_text.doOnTextChanged { text, start, before, count ->
            viewModel.onTextChanged(text.toString())
        }
    }
}