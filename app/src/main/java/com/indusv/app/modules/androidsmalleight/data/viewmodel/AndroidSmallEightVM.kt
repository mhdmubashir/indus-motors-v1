package com.indusv.app.modules.androidsmalleight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indusv.app.modules.androidsmalleight.`data`.model.AndroidSmallEightModel
import org.koin.core.KoinComponent

class AndroidSmallEightVM : ViewModel(), KoinComponent {
  val androidSmallEightModel: MutableLiveData<AndroidSmallEightModel> =
      MutableLiveData(AndroidSmallEightModel())

  var navArguments: Bundle? = null
}
