package com.indusv.app.modules.androidsmallnine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indusv.app.modules.androidsmallnine.`data`.model.AndroidSmallNineModel
import org.koin.core.KoinComponent

class AndroidSmallNineVM : ViewModel(), KoinComponent {
  val androidSmallNineModel: MutableLiveData<AndroidSmallNineModel> =
      MutableLiveData(AndroidSmallNineModel())

  var navArguments: Bundle? = null
}
