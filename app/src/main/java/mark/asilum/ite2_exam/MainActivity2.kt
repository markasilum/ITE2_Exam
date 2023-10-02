package mark.asilum.ite2_exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val thisIntent: Intent = intent
        val getFirstname2: String = thisIntent.getStringExtra("Firstname").toString()
        Log.d("ZZZZ125",getFirstname2)

        val tvName:TextView = findViewById(R.id.txtPassvalue)
        tvName.setText(getFirstname2)


    }

    override fun onStart() {
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}