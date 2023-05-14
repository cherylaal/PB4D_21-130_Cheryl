package com.example.praktikummodul4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

//
class Fragment2 : Fragment() {

    var nim: String? = null
    var alamat: String? = null
    var sekolah: String? = null

    companion object{
        val EXTRA_NIM = "extra_nim"
        val EXTRA_NAMA = "extra_nama"
        val EXTRA_ALAMAT = "extra_alamat"
        val EXTRA_SEKOLAH = "extra_sekolah"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragment1 = Fragment1()
        val btn_satu = view.findViewById<Button>(R.id.btn_satu)
        btn_satu.setOnClickListener{
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, fragment1, Fragment1::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (savedInstanceState != null){
            val nimm = savedInstanceState.getString(EXTRA_NIM)
            nim = nimm
            val alamatt = savedInstanceState.getString(EXTRA_ALAMAT)
            alamat = alamatt
            val sekolahh = savedInstanceState.getString(EXTRA_SEKOLAH)
            sekolah = sekolahh
        }

        if (arguments != null){
            val nama = arguments?.getString(EXTRA_NAMA)
            val tv_nama = view?.findViewById<TextView>(R.id.tv_nama)
            val tv_nim = view?.findViewById<TextView>(R.id.tv_nim)
            val tv_alamat = view?.findViewById<TextView>(R.id.tv_alamat)
            val tv_sekolah = view?.findViewById<TextView>(R.id.tv_sekolah)
            if (tv_nama != null) {
                tv_nama.text = nama
            }
            if (tv_nim != null) {
                tv_nim.text = nim
            }
            if (tv_alamat != null) {
                tv_alamat.text = alamat
            }
            if (tv_sekolah != null) {
                tv_sekolah.text = sekolah
            }
        }
    }

}