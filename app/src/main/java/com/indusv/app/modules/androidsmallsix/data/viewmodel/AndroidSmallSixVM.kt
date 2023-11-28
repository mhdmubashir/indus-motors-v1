package com.indusv.app.modules.androidsmallsix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indusv.app.modules.androidsmallsix.`data`.model.AndroidSmallSixModel
import org.koin.core.KoinComponent

class AndroidSmallSixVM : ViewModel(), KoinComponent {
  val androidSmallSixModel: MutableLiveData<AndroidSmallSixModel> =
      MutableLiveData(AndroidSmallSixModel())

  var navArguments: Bundle? = null
}
