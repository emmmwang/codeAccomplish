package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_main)
          用代码来构建界面
          1.创建容器->承载内容 LinearLayout RelativeLayout ConstantLayout
         */
        addLinearLayoutKotlin()
    }

    private fun addLinearLayoutKotlin(){
        //创建容器
        LinearLayout(this).apply {
            //设置宽高
            layoutParams=LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)

            //方向
            orientation=LinearLayout.VERTICAL

            //设置背景颜色
            background=getDrawable(R.color.colorAccent)

            setContentView(this)

        }
    }

   /* fun addLinearLayout(){
        //1.创建容器->LinearLayout
        val linearLayout=LinearLayout(this)

        //2.给容器设置宽高
        //layoutParams   管理控件的参数
        linearLayout.layoutParams=LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT)

        //3.设置布局方向
        linearLayout.orientation=LinearLayout.VERTICAL

        //4.添加同期到Activity
        setContentView(linearLayout)
        //设置颜色
        linearLayout.background=getDrawable(R.color.colorAccent)
    }

    */
}