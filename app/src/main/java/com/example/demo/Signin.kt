package com.example.demo

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.textfield.TextInputEditText


class Signin : Fragment() {

    private lateinit var viewModel: SigninViewModel
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("fragment", "onAttach")
        Log.d("fragment", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("fragment", "onCreate")

        Log.d("fragment", "onCreate")


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return inflater.inflate(R.layout.fragment_signin, container, false)



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("fragment", "onViewCreated")
        Log.d("fragment", "onViewCreated")
        val userName: TextInputEditText = view.findViewById(R.id.EditText)
        val button: Button = view.findViewById(R.id.button2)
        val nameText: TextView = view.findViewById(R.id.textView2)
        viewModel = ViewModelProvider(this).get(SigninViewModel::class.java)
        viewModel.uid.observe(viewLifecycleOwner, Observer {
            nameText.text = it
        })

        button.setOnClickListener {
            viewModel.saveUserid(userName.text.toString())
            nameText.visibility = View.VISIBLE
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("fragment", "onStart")
        Log.d("fragment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("fragment", "onResume")
        Log.d("fragment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("fragment", "onPause")
        Log.d("fragment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("fragment", "onStop")
        Log.d("fragment", "onStop")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("fragment", "onDestroy")
        Log.d("fragment", "onDestroy")
    }

}


