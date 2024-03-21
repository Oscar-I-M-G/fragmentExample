package com.example.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), OnFragmentActionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnRed: Button = findViewById(R.id.btnRed)
        val btnBlue:Button = findViewById(R.id.btnBlue)
        btnRed.setOnClickListener { replaceFragment(RedFragment()) }
        btnBlue.setOnClickListener { replaceFragment(BlueFragment()) }
    }

    override fun onClickFragmentButton() {
        Toast.makeText(this,"Presionaste el botom omg :O",Toast.LENGTH_SHORT).show()
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragmentContainer, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

}