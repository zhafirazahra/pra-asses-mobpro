package org.d3if4042.pra_asses


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3if4042.pra_asses.databinding.FragmentSegitigaBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SegitigaFragment : Fragment() {

    lateinit var binding: FragmentSegitigaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_segitiga, container, false)

        binding.btnHitungS.setOnClickListener {

            var luasp = 1/2 *(binding.etAlasS.text.toString().toDouble() * binding.etTinggiS.text.toString().toDouble())
            var kllp = binding.etAlasS.text.toString().toDouble() + binding.etTinggiS.text.toString().toDouble()

//            binding.tvLuasS.text = getString(R.string.)
        }
        // Inflate the layout for this fragment
        return binding.root
    }


}
