package com.indusv.app.modules.androidsmalltwentyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indusv.app.modules.androidsmalltwentyone.`data`.model.AndroidSmallTwentyoneModel
import org.koin.core.KoinComponent

class AndroidSmallTwentyoneVM : ViewModel(), KoinComponent {
  val androidSmallTwentyoneModel: MutableLiveData<AndroidSmallTwentyoneModel> =
      MutableLiveData(AndroidSmallTwentyoneModel())

  var navArguments: Bundle? = null
}
