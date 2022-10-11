package com.example.iab_odev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.iab_odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    private  var kontrol : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim =ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.button0.setOnClickListener {
            if (kontrol == true){
                temizle()
                tasarim.textView.text="${tasarim.textView.text}0"
            }else{
                tasarim.textView.text="${tasarim.textView.text}0"
            }
        }
        tasarim.button1.setOnClickListener {
            if (kontrol == true) {
                temizle()
                tasarim.textView.text = "${tasarim.textView.text}1"
            }else {
                tasarim.textView.text = "${tasarim.textView.text}1"
            }
        }
        tasarim.button2.setOnClickListener {
            if (kontrol == true) {
                temizle()
                tasarim.textView.text = "${tasarim.textView.text}2"
            }else {
                tasarim.textView.text = "${tasarim.textView.text}2"
            }
        }
        tasarim.button3.setOnClickListener {
            if (kontrol == true) {
                temizle()
                tasarim.textView.text = "${tasarim.textView.text}3"
            }else {
                tasarim.textView.text = "${tasarim.textView.text}3"
            }
        }
        tasarim.button4.setOnClickListener {
            if (kontrol == true) {
                temizle()
                tasarim.textView.text = "${tasarim.textView.text}4"
            }else {
                tasarim.textView.text = "${tasarim.textView.text}4"
            }
        }
        tasarim.button5.setOnClickListener {
            if (kontrol == true) {
                temizle()
                tasarim.textView.text = "${tasarim.textView.text}5"
            }else {
                tasarim.textView.text = "${tasarim.textView.text}5"
            }
        }
        tasarim.button6.setOnClickListener {
            if (kontrol == true) {
                temizle()
                tasarim.textView.text = "${tasarim.textView.text}6"
            }else {
                tasarim.textView.text = "${tasarim.textView.text}6"
            }
        }
        tasarim.button7.setOnClickListener {
            if (kontrol == true) {
                temizle()
                tasarim.textView.text = "${tasarim.textView.text}7"
            }else {
                tasarim.textView.text = "${tasarim.textView.text}7"
            }
        }
        tasarim.button8.setOnClickListener {
            if (kontrol == true) {
                temizle()
                tasarim.textView.text = "${tasarim.textView.text}8"
            }else {
                tasarim.textView.text = "${tasarim.textView.text}8"
            }
        }
        tasarim.button9.setOnClickListener {
            if (kontrol == true) {
                temizle()
                tasarim.textView.text = "${tasarim.textView.text}9"
            }else {
                tasarim.textView.text = "${tasarim.textView.text}9"
            }
        }
        tasarim.buttonAC.setOnClickListener {
            tasarim.textView.text=""
        }
        tasarim.buttonDelete.setOnClickListener {
            val eski = tasarim.textView.text
            val kalan =eski.dropLast(1)
            tasarim.textView.text = kalan
        }
        tasarim.buttonPlus.setOnClickListener {
            if (tasarim.textView.text == ""){
                Toast.makeText(getBaseContext(),"Lütfen Sayı Giriniz..",Toast.LENGTH_SHORT).show()
            }else{
                tasarim.textView.text = "${tasarim.textView.text} + "
                kontrol=false
            }
        }
        tasarim.buttonEqual.setOnClickListener {
            if (tasarim.textView.text == ""){
                Toast.makeText(getBaseContext(),"Lütfen Sayı Giriniz..",Toast.LENGTH_SHORT).show()
            }else{
                var sonuc = 0
                val sayi_dizisi = tasarim.textView.text.split(" + ")
                for (i in sayi_dizisi){
                    sonuc +=i.toInt()
                    tasarim.textView.text = ""
                    tasarim.textView.text = sonuc.toString()
                    kontrol = true
                }
            }
        }


    }
    fun temizle(){
        tasarim.textView.text = ""
        kontrol = false
    }




}