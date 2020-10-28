package com.linlinlin.navigationcourse

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.linlinlin.navigationcourse.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_register.*


class RegisterFragment : BaseFragment() {

    override fun getLayoutResID()= R.layout.fragment_register
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        to_avatar_verity_from_register.setOnClickListener {
            findNavController().navigate(R.id.action_register_fragment_to_avatarVerityFragment)
        }
    }

}