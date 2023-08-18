// her sayfada 3 cardview olucak şekilde yatayda kaydırılabilen recyclerView
package com.helinavci.kotlinakademihwweek5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.helinavci.kotlinakademihwweek5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var meslekler : ArrayList<meslekler>
    private lateinit var adapter : rvAdapter
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        meslekler = ArrayList<meslekler>()
        val m1 = meslekler("ÇİFTÇİ" , "ciftci")
        val m2 = meslekler("GARSON" , "garson")
        val m3 = meslekler("HEMŞİRE" , "hemsire")
        val m4 = meslekler("HIRSIZ" , "hirsiz")
        val m5 = meslekler("İŞÇİ" , "isci")
        val m6 = meslekler("RESSAM" , "ressam")
        meslekler.add(m1)
        meslekler.add(m2)
        meslekler.add(m3)
        meslekler.add(m4)
        meslekler.add(m5)
        meslekler.add(m6)
       binding.rv.setHasFixedSize(true)
        adapter = rvAdapter(this , meslekler)
        binding.rv.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL)
        binding.rv.adapter = adapter
    }
}