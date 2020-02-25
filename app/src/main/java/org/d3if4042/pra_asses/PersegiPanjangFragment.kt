package org.d3if4042.pra_asses


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import org.d3if4042.pra_asses.databinding.FragmentPersegiPanjangBinding
import org.d3if4042.pra_asses.databinding.FragmentSegitigaBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiPanjangFragment : Fragment() {

    lateinit var binding: FragmentPersegiPanjangBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_persegi_panjang, container, false)

        binding.btnHitungPp.setOnClickListener {

            var luasp = binding.etPanjangPp.text.toString().toDouble() * binding.etLebarPp.text.toString().toDouble()
            var kllp = 2*(binding.etPanjangPp.text.toString().toDouble() + binding.etLebarPp.text.toString().toDouble())

//            binding.tvLuasPp.text = getString(R.string.)
        }
        // Inflate the layout for this fragment
        return binding.root
    }


}
