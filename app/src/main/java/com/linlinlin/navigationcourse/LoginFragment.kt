package com.linlinlin.navigationcourse

import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import androidx.navigation.ActivityNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.linlinlin.navigationcourse.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : BaseFragment() {

    override fun getLayoutResID() = R.layout.fragment_login

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_to_register.setOnClickListener {
            val extras = FragmentNavigatorExtras(username to "inputTn")
            val bundle = Bundle()
            bundle.putString("username", username.text.toString().trim())
            findNavController().navigate(R.id.to_register_from_login, bundle, null, extras)
        }
        btn_to_forget.setOnClickListener {
            findNavController().navigate(R.id.to_forget_from_login)
        }
        btn_to_agreement.setOnClickListener {
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                requireActivity(),
                Pair.create(image, "hero_image"),
                        Pair.create(username, "inputTn")
            )
            val bundle = Bundle()
            bundle.putString("username", username.text.toString().trim())
            val extras = ActivityNavigator.Extras.Builder().setActivityOptions(options).build()
            findNavController().navigate(R.id.to_agreement_activity_from_login, bundle, null, extras)
        }
    }
}