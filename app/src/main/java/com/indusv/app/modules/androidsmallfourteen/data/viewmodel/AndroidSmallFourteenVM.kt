package com.indusv.app.modules.androidsmallfourteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indusv.app.modules.androidsmallfourteen.`data`.model.AndroidSmallFourteenModel
import org.koin.core.KoinComponent

class AndroidSmallFourteenVM : ViewModel(), KoinComponent {
  val androidSmallFourteenModel: MutableLiveData<AndroidSmallFourteenModel> =
      MutableLiveData(AndroidSmallFourteenModel())

  var navArguments: Bundle? = null
}
