package com.jollyahirukka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val jollylist = listOf("Jolly Ah Irukka","ஜாலியா இருக்க","जालीया इरुक्क","джа ли ах ирука","乔里 啊 伊鲁卡","print(\"Jolly ah Irukka\")","echo \"Sm9sbHkgQWggSXJ1a2th\" | base64 -d | bash","તમે ખુશ છો","c08a84a9162740100749d8666a9dfda3","am9sbHkgYWggaXJ1a2th","Malipayon ka","Vostè és feliç","си щастлив","ste sretni","আপনি খুশি","Вы шчаслівыя","ジョリー ああ イルカ")
    lateinit var jolly: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        jolly=findViewById(R.id.jollyahirukka)
        jolly.text=jollylist.random()
    }

}