package es.murallaromana.fragments.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.murallaromana.fragments.R
import es.murallaromana.fragments.fragments.PrimeraFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** Clses utiles:
         *      - FragmentManager (está en Activity, se llama supportFragmentManager)
         *      - GragmentTransaction
         *      - Fragment
         */

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.contenedor_fragments, PrimeraFragment())
        fragmentTransaction.commit()
    }
}