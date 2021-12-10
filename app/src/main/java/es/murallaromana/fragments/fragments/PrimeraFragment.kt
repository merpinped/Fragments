package es.murallaromana.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import es.murallaromana.fragments.R

class PrimeraFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_primera, container, false)

        val btnIrOtroFragment: Button = view.findViewById(R.id.btn_ir_al_segundo_fragment)

        btnIrOtroFragment.setOnClickListener() {
            val ft = activity?.supportFragmentManager?.beginTransaction()

            ft?.replace(R.id.contenedor_fragments, SegundoFragment())
            ft?.addToBackStack(null)
            ft?.commit()
        }

        return view
    }
}