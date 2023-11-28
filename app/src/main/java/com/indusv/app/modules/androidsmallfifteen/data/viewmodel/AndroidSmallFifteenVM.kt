package com.indusv.app.modules.androidsmallfifteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indusv.app.modules.androidsmallfifteen.`data`.model.AndroidSmallFifteenModel
import org.koin.core.KoinComponent

class AndroidSmallFifteenVM : ViewModel(), KoinComponent {
  val androidSmallFifteenModel: MutableLiveData<AndroidSmallFifteenModel> =
      MutableLiveData(AndroidSmallFifteenModel())

  var navArguments: Bundle? = null
}
