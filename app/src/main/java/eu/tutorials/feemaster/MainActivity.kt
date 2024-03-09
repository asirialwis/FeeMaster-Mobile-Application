package eu.tutorials.feemaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val button1 = findViewById<ImageView>(R.id.imageView2)
//        button1.setOnClickListener{
//            val intent1 = Intent(this,MainActivity3::class.java)
//            startActivity(intent1)
//        }
        val button1 = findViewById<ImageView>(R.id.imageView2)
        button1.setOnClickListener {
            val delayMillis = 500

            Handler().postDelayed({
                val intent1 = Intent(this, MainActivity3::class.java)
                startActivity(intent1)
            }, delayMillis.toLong())
        }

        val button2 = findViewById<TextView>(R.id.newUser)
        button2.setOnClickListener{
            val intent1 = Intent(this , MainActivity2::class.java)
            startActivity(intent1)
        }
    }
}