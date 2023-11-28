package com.indusv.app.modules.androidsmalltwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indusv.app.modules.androidsmalltwo.`data`.model.AndroidSmallTwoModel
import org.koin.core.KoinComponent

class AndroidSmallTwoVM : ViewModel(), KoinComponent {
  val androidSmallTwoModel: MutableLiveData<AndroidSmallTwoModel> =
      MutableLiveData(AndroidSmallTwoModel())

  var navArguments: Bundle? = null
}
