package com.indusv.app.modules.androidsmallseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indusv.app.modules.androidsmallseven.`data`.model.AndroidSmallSevenModel
import org.koin.core.KoinComponent

class AndroidSmallSevenVM : ViewModel(), KoinComponent {
  val androidSmallSevenModel: MutableLiveData<AndroidSmallSevenModel> =
      MutableLiveData(AndroidSmallSevenModel())

  var navArguments: Bundle? = null
}
