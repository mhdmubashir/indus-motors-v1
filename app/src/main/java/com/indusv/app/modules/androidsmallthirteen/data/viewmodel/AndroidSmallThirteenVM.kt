package com.indusv.app.modules.androidsmallthirteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indusv.app.modules.androidsmallthirteen.`data`.model.AndroidSmallThirteenModel
import org.koin.core.KoinComponent

class AndroidSmallThirteenVM : ViewModel(), KoinComponent {
  val androidSmallThirteenModel: MutableLiveData<AndroidSmallThirteenModel> =
      MutableLiveData(AndroidSmallThirteenModel())

  var navArguments: Bundle? = null
}
