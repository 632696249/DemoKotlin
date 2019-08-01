package com.demokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.demokotlin.R.id.*
import com.demokotlin.utils.Preference
import kotlinx.android.synthetic.main.activity_welcome.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast

class WelcomeActivity : AppCompatActivity() {
    private var name: String by Preference(this, "name", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        initView()
        //数组的操作
        initArray()
    }

    private fun initView() {
        tv_hello.text = "你好呀"
        btn_click.setOnClickListener { btn_click.text = "您点击了一下下" }
        btn_click_long.setOnLongClickListener { btn_click_long.text = "您长按了一小会";true }
        btn_toast.setOnClickListener { toast("小提示:您点击了一下下") }
        btn_toast_long.setOnLongClickListener { longToast("长提示:您长按了一小会");true }

        btn_class_main.setOnClickListener {
            var count = 1
            /* when (count % 2) {
                 0 -> {
                     var animal = AnimalMain(this, "name")
                 }
                 else -> {
                     var animal = AnimalMain(this, "name",1)
                 }

             }*/
            var animal = when(count%2) {
                0->WildAnimal("name")
                else -> WildAnimal("name",1)
            }
            toast("这只${animal.name}是${if (animal.sex == 0) "公" else "母"}的")

            toast("这只${animal.name}是${animal.sexName}的")

            toast(animal.getDesc("动物园"))
        }
    }

    private fun initArray() {
        var string_array: Array<String> = arrayOf("How", "Are", "You")
        btn_click.setOnClickListener {
            var str: String = ""
            var i: Int = 0
            while (i < string_array.size) {
                str = str + string_array[i] + ","
                i++
            }
        }
    }

}
