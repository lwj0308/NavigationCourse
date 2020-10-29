package com.linlinlin.navigationcourse

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.transition.TransitionInflater
import com.linlinlin.navigationcourse.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_register.*


class RegisterFragment : BaseFragment() {

    override fun getLayoutResID() = R.layout.fragment_register

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = TransitionInflater.from(requireContext())
            .inflateTransition(R.transition.shared_image)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val userName = arguments?.getString("username")
        username.setText(userName)
        to_avatar_verity_from_register.setOnClickListener {
            //使用共享元素过渡时，不得使用动画框架（上一部分中的 enterAnim、exitAnim 等），而只能使用过渡框架来设置进入和退出过渡。
            val extras = FragmentNavigatorExtras(image to "image_title")
            findNavController().navigate(
                R.id.action_register_fragment_to_avatarVerityFragment,
                null,
                null,
                extras
            )
        }
    }

}