package com.indusv.app.modules.androidsmalleighteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indusv.app.modules.androidsmalleighteen.`data`.model.AndroidSmallEighteenModel
import org.koin.core.KoinComponent

class AndroidSmallEighteenVM : ViewModel(), KoinComponent {
  val androidSmallEighteenModel: MutableLiveData<AndroidSmallEighteenModel> =
      MutableLiveData(AndroidSmallEighteenModel())

  var navArguments: Bundle? = null
}
