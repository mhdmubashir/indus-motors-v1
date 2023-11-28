package com.indusv.app.modules.androidsmallten.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indusv.app.modules.androidsmallten.`data`.model.AndroidSmallTenModel
import org.koin.core.KoinComponent

class AndroidSmallTenVM : ViewModel(), KoinComponent {
  val androidSmallTenModel: MutableLiveData<AndroidSmallTenModel> =
      MutableLiveData(AndroidSmallTenModel())

  var navArguments: Bundle? = null
}
