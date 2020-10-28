package com.linlinlin.navigationcourse

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.linlinlin.navigationcourse.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : BaseFragment() {

    override fun getLayoutResID()= R.layout.fragment_login

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_to_register.setOnClickListener {
            findNavController().navigate(R.id.to_register_from_login)
        }
        btn_to_forget.setOnClickListener {
            findNavController().navigate(R.id.to_forget_from_login)
        }
        btn_to_agreement.setOnClickListener {
            findNavController().navigate(R.id.to_agreement_activity_from_login)
        }
    }
}