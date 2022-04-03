package cucer.darian.f1races.screens.details

import android.os.Bundle
import android.view.View
import cucer.darian.f1races.R
import cucer.darian.f1races.core.base.BaseFragment
import cucer.darian.f1races.databinding.FragmentUserDetailsBinding
import org.koin.core.inject

class UserDetailsFragment: BaseFragment<UserDetailsViewModel, FragmentUserDetailsBinding>() {

    override val viewModel: UserDetailsViewModel by inject()

    override fun whichLayout(): Int = R.layout.fragment_user_details

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.load()
    }
}