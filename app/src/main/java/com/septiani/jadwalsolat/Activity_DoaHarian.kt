package com.septiani.jadwalsolat

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

import butterknife.ButterKnife
import butterknife.OnClick

class Activity_DoaHarian : AppCompatActivity() {

    internal var pagi_activity: CardView? = null

    internal var sore_activity: CardView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doaharian)
        ButterKnife.bind(this)
    }

    @OnClick(R.id.pagi_activity)
    fun onCrpagiClicked() {
        startActivity(Intent(this@Activity_DoaHarian, PagiActivity::class.java))

    }

    @OnClick(R.id.sore_activity)
    fun onCrpetangClicked() {
        startActivity(Intent(this@Activity_DoaHarian, SoreActivity::class.java))
    }
}