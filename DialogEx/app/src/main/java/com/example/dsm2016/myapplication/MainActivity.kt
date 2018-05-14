package com.example.dsm2016.myapplication

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDialog(view : View) {
        var builder : AlertDialog.Builder = AlertDialog.Builder(this);
        var inflater : LayoutInflater = layoutInflater;
        var view = inflater.inflate(R.layout.dialog_main, null);
        builder.setView(view);
        builder.setNegativeButton("No", object : DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                Toast.makeText(applicationContext,"onClicl", Toast.LENGTH_SHORT);
            }
        })

        builder.setNegativeButton("Yes", object  : DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {

            }

        })
    }
}
