package at.arthurbraun.hak_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {

            var loginName = "braun.arthur"
            var loginPwd = "Passwort1"

            var name = txtUsername.text.toString()
            var password = txtPassword.text.toString()

            if (name == loginName && password == loginPwd) {
                val loginIntent = Intent(this, BasicActivity::class.java)
                startActivity(loginIntent)
            } else if (name == loginName && password != loginPwd) {
                Toast.makeText(this, "Falsches Passwort", Toast.LENGTH_SHORT).show()
            } else if (name != loginName && password == loginPwd) {
                Toast.makeText(this, "Benutzer $name nicht vorhanden", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
