package com.septiani.jadwalsolat.view

import android.content.Context
import androidx.viewpager.widget.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

import com.septiani.jadwalsolat.PagiActivity
import com.septiani.jadwalsolat.R

class ViewPagerAdapterPG(internal var context: PagiActivity, internal var judul: Array<String>, internal var keteranganarab: Array<String>, internal var keteranganindo: Array<String>) : PagerAdapter() {

    internal lateinit var inflater: LayoutInflater

    override fun getCount(): Int {
        return judul.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.itempagi, container, false)

        val jdl = view.findViewById<TextView>(R.id.judul)
        val ktrng = view.findViewById<TextView>(R.id.keteranganarab)
        val ktrngindo = view.findViewById<TextView>(R.id.keteranganindo)

        jdl.text = judul[position]
        ktrng.text = keteranganarab[position]
        ktrngindo.text = keteranganindo[position]
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout)
    }
}