package eu.tutorials.feemaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val button1 = findViewById<ImageView>(R.id.imageView24)
        button1.setOnClickListener{
            val intent1 = Intent(this , MainActivity3::class.java)
            startActivity(intent1)
        }
    }
}