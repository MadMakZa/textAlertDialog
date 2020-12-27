package com.example.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createSimpleDialog()
    }
    //просто диалог
    private fun createSimpleDialog(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Alert Dialog")
        builder.setMessage("This is alert dialog")

        builder.setNeutralButton("Info"){dialogInterface, i ->

        }
        builder.setNegativeButton("No"){dialog, i ->

        }
        builder.setPositiveButton("Yes"){dialog, i ->
            //запуск мультидиалога
            createSimpleMultichoiceDialog()
        }
        builder.show()
    }
    //диалог со списком выбора
    private fun createSimpleMultichoiceDialog(){
        val builderMulti = AlertDialog.Builder(this)
        builderMulti.setTitle("Multi Dialog")
        builderMulti.setMultiChoiceItems(R.array.multi_item, null){dialog,wich,choise ->
            Log.d("clicked", "My choise is : " + wich + " is" + choise)
        }
        builderMulti.show()
    }
}