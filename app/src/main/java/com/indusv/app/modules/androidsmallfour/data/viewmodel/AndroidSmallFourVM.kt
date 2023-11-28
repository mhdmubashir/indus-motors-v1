package com.indusv.app.modules.androidsmallfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indusv.app.modules.androidsmallfour.`data`.model.AndroidSmallFourModel
import org.koin.core.KoinComponent

class AndroidSmallFourVM : ViewModel(), KoinComponent {
  val androidSmallFourModel: MutableLiveData<AndroidSmallFourModel> =
      MutableLiveData(AndroidSmallFourModel())

  var navArguments: Bundle? = null
}
