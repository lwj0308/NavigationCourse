package com.linlinlin.navigationcourse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_agreement.*

class AgreementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agreement)
        val stringExtra = intent?.getStringExtra("username")
        username.setText(stringExtra)

    }
}