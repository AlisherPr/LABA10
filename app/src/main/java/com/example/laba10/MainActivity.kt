package com.example.laba10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import android.widget.Spinner
import android.widget.Toast
import android.widget.ArrayAdapter
import android.widget.AdapterView


class MainActivity : AppCompatActivity() {
    val figures = arrayOf("Треугольник", "Прямоугольник", "Круг")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, figures)
        spinner.adapter = arrayAdapter

        val firstNum = findViewById<EditText>(R.id.firstNum)
        val secondNum = findViewById<EditText>(R.id.secondNum)
        val thirdNum = findViewById<EditText>(R.id.thirdNum)
        val fourthNum = findViewById<EditText>(R.id.fourthNum)
        val button = findViewById<Button>(R.id.button)
        var index : Int = 0

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (p2==0){
                    index = 0
                }
                if (p2==1){
                    index = 1
                }
                if (p2==2){
                    index = 2
                }
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        button.setOnClickListener{
                if (index == 0){
                    Log.d("INDEX","$index")
                    if (!firstNum.getText().toString().equals("")&&
                        !secondNum.getText().toString().equals("")&&
                        !thirdNum.getText().toString().equals(""))
                    {
                        Log.d("INDEX","$index - не пустой")
                        val result = firstNum.getText().toString().toInt() + secondNum.getText().toString().toInt() + thirdNum.getText().toString().toInt()
                        Toast.makeText(applicationContext,result.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
                if (index == 1){
                    Log.d("INDEX","$index")
                    if (!firstNum.getText().toString().equals("")&&
                        !secondNum.getText().toString().equals("")&&
                        !thirdNum.getText().toString().equals("")&&
                        !fourthNum.getText().toString().equals(""))
                    {
                        Log.d("INDEX","$index - не пустой")
                        val result = firstNum.getText().toString().toInt() + secondNum.getText().toString().toInt() + thirdNum.getText().toString().toInt() + fourthNum.getText().toString().toInt()
                        Toast.makeText(applicationContext,result.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
                if (index==2){
                    Log.d("INDEX","$index")
                    if (!firstNum.getText().toString().equals("")){
                        Log.d("INDEX","$index - не пустой")
                        val result = 2 * 3.14 * firstNum.getText().toString().toInt()
                        Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }
}
