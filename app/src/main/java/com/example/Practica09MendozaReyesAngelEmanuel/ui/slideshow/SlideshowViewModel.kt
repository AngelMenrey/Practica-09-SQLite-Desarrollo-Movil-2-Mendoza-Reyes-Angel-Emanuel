package com.example.Practica09MendozaReyesAngelEmanuel.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Practica 09 - Mendoza Reyes Angel Emanuel"
    }
    val text: LiveData<String> = _text
}