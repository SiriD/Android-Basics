package com.sirid.androidbasics.fragmentsbasics

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.sirid.androidbasics.R

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    companion object {
        fun newInstance(): FirstFragment = FirstFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("onCreateView", "onCreateView called")
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("onCreate", "onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart", "onStart called")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("onAttach", "onAttach called")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("onActivityCreated", "onActivityCreated called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause", "onPause called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("onDestroyView", "onDestroyView called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy", "onDestroy called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("onDetach", "onDetach called")
    }
}
