package com.indusv.app.modules.androidsmalltwenty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indusv.app.modules.androidsmalltwenty.`data`.model.AndroidSmallTwentyModel
import org.koin.core.KoinComponent

class AndroidSmallTwentyVM : ViewModel(), KoinComponent {
  val androidSmallTwentyModel: MutableLiveData<AndroidSmallTwentyModel> =
      MutableLiveData(AndroidSmallTwentyModel())

  var navArguments: Bundle? = null
}
