package com.example.homeprice.a

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.homeprice.R
import com.example.homeprice.a.data.Repository
import com.example.homeprice.databinding.FragmentOneBinding
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import java.lang.Exception

class FragmentOne : Fragment() {
    lateinit var binding: FragmentOneBinding
    private  val scope = MainScope()
    private val repository = Repository()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOneBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.button.setOnClickListener {
            val inputButton = binding.input.text.toString()
            val inputButton1 = binding.input.text.toString()


                scope.launch {
                    try {
                        val repo = repository.getApi(inputButton,inputButton1)
                        Log.d(javaClass.simpleName,repo.toString())
                    }catch (e:Exception){
                        Log.w(javaClass.simpleName,e)
                    }
                }
        }


        binding.button.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(
                    R.id.fragmentContainers,
                        FragmentTwo().also {
                            it.arguments = Bundle().also {
                                it.putString("input", binding.input.text.toString())

                                }
                            }
                        )
                .addToBackStack(null)
                .commit()
        }
    }
}