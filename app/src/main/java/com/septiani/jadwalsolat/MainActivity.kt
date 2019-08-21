package com.septiani.jadwalsolat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {


    internal lateinit var rellay_jadwal: RelativeLayout //rellay_jadwal
    internal lateinit var rellay_halal: RelativeLayout //rellay_halal
    internal lateinit var rellay_asmaulhusna: RelativeLayout // rellay_asmaulhusna
    internal lateinit var rellay_doaharian: RelativeLayout  // rellay_doaharian

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rellay_jadwal = findViewById(R.id.rellay_jadwal)
        rellay_halal = findViewById(R.id.rellay_halal)
        rellay_asmaulhusna = findViewById(R.id.rellay_asmaulhusna)
        rellay_doaharian = findViewById(R.id.rellay_doaharian)


        rellay_jadwal.setOnClickListener {
            val intent = Intent(this@MainActivity, Activity_Jadwal::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }
        rellay_halal.setOnClickListener {
            val intent = Intent(this@MainActivity, Activity_Halal::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }
        rellay_asmaulhusna.setOnClickListener {
            val intent = Intent(this@MainActivity, ActivityAsmaulHusna::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }
        rellay_doaharian.setOnClickListener {
            val intent = Intent(this@MainActivity, Activity_DoaHarian::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }
    }
}