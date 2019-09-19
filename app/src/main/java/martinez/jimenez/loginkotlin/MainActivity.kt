package martinez.jimenez.loginkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btLogin.setOnClickListener {
            val user = etUsr.text.toString()
            val pass = etPass.text.toString()
            if (user.equals("") and pass.equals("")){
                mensaje("Debes rellenar los campos!!")
            }
            else if (user.equals("")){
                mensaje("Falta el usuario!")
            }
            else if (pass.equals("")){
                mensaje("Ingresa tu contraseña")
            }
            else{
                if (user.equals("set") and pass.equals("hola12345")){
                    mensaje("Bienvenido: $user")
                }else{
                    mensaje("No te conozco >:c")
                    etUsr.setText("")
                    etPass.setText("")
                    etUsr.requestFocus() //pa ingresar usuario de nuevo
                }
            }
        }
    }
    override fun onStart() {
        super.onStart()
        Log.wtf("ejemplo", "creo que estoy en onstart")
    }

    override fun onResume() {
        super.onResume()
        Log.wtf("ejemplo", "creo que estoy en Onresume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.wtf("ejemplo", "creo que estoy en OnRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.wtf("ejemplo","creo que estoy en onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.wtf("ejemplo","creo que estoy en onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.wtf("ejemplo", "creo que estoy en onDestroy")
    }
    fun mensaje(mensaje:String) {
        Toast.makeText(this,mensaje, Toast.LENGTH_LONG).show()
    }
}
