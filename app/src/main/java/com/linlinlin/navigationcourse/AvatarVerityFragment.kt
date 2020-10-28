package com.linlinlin.navigationcourse

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.linlinlin.navigationcourse.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_avatar_verity.*

class AvatarVerityFragment : BaseFragment() {


    override fun getLayoutResID()=R.layout.fragment_avatar_verity

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_to_login_from_avatar_veerity.setOnClickListener {
            findNavController().navigate(R.id.action_avatarVerityFragment_to_login_fragment)
        }
    }

}