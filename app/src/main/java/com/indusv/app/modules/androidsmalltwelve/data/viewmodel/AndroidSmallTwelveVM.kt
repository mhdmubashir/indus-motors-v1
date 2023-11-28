package com.indusv.app.modules.androidsmalltwelve.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indusv.app.modules.androidsmalltwelve.`data`.model.AndroidSmallTwelveModel
import org.koin.core.KoinComponent

class AndroidSmallTwelveVM : ViewModel(), KoinComponent {
  val androidSmallTwelveModel: MutableLiveData<AndroidSmallTwelveModel> =
      MutableLiveData(AndroidSmallTwelveModel())

  var navArguments: Bundle? = null
}
