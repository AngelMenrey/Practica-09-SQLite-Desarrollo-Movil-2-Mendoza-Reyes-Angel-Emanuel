package com.example.Practica09MendozaReyesAngelEmanuel.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Practica 09 - Mendoza Reyes Angel Emanuel"
    }
    val text: LiveData<String> = _text
}