package com.indusv.app.modules.androidsmalleleven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indusv.app.modules.androidsmalleleven.`data`.model.AndroidSmallElevenModel
import org.koin.core.KoinComponent

class AndroidSmallElevenVM : ViewModel(), KoinComponent {
  val androidSmallElevenModel: MutableLiveData<AndroidSmallElevenModel> =
      MutableLiveData(AndroidSmallElevenModel())

  var navArguments: Bundle? = null
}
