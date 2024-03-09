package eu.tutorials.feemaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LogoLaunch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo_launch)

        val delayMillis = 9000
        android.os.Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Optional: Finish LogoActivity to prevent going back to it
        }, delayMillis.toLong())
    }
}