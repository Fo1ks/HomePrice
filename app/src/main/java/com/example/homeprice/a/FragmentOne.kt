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
    private lateinit var binding: FragmentOneBinding
    private val scope = MainScope()
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

            scope.launch {
                try {
                    val repo = repository.getCurrentCadaster(inputButton,0)
                    Log.wtf(javaClass.simpleName, repo.toString())
                } catch (e: Exception) {
                    Log.wtf(javaClass.simpleName, e)
                }
            }


            binding.button.setOnClickListener {
                parentFragmentManager.beginTransaction()
                    .replace(
                        R.id.fragmentsContainer,
                        FragmentTwo().also { it ->
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
}

