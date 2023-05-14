package com.example.praktikummodul4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragment2 = Fragment2()
        val btn_dua = view.findViewById<Button>(R.id.btn_dua)
        btn_dua.setOnClickListener{
            val bundle = Bundle()
            val et_nama = view.findViewById<EditText>(R.id.etNama)
            val et_nim = view.findViewById<EditText>(R.id.etNIM)
            val et_alamat = view.findViewById<EditText>(R.id.etAlamat)
            val et_sekolah = view.findViewById<EditText>(R.id.etSekolah)
            val nama = et_nama.text.toString()
            val nim = et_nim.text.toString()
            val alamat = et_alamat.text.toString()
            val sekolah = et_sekolah.text.toString()

            bundle.putString(Fragment2.EXTRA_NAMA, nama)

            fragment2.arguments = bundle
            fragment2.nim = nim
            fragment2.alamat = alamat
            fragment2.sekolah = sekolah

            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, fragment2, Fragment2::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }
    }

    private fun findViewById(btnDua: Int): Button {
        TODO("Not yet implemented")
    }

}