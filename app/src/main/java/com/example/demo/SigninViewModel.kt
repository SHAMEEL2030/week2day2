package com.example.demo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SigninViewModel : ViewModel(){
    val uid= MutableLiveData<String>()
    fun saveUserid(User:String){
        uid.value = User
    }

}