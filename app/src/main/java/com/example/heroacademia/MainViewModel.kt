package com.example.heroacademia

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var searchText = MutableLiveData<String>("")

    fun SearchList(){
        searchText.value = "abhinay"
    }
}