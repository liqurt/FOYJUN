package com.example.android.foyjun

import android.os.Handler
import android.os.Message
import android.util.Log
import com.example.android.foyjun.Camera2BasicFragment.Companion.textView

class PreviewHandler : Handler() {
    override fun handleMessage(msg: Message) {
        //이 밑의 텍뷰는 컴패니언이라 대충 접근 가능 자바로 치면 스태틱
        textView!!.text = msg.obj.toString()
    }
}