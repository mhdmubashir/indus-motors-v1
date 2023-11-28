package com.indusv.app.modules.androidsmallsixteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indusv.app.modules.androidsmallsixteen.`data`.model.AndroidSmallSixteenModel
import org.koin.core.KoinComponent

class AndroidSmallSixteenVM : ViewModel(), KoinComponent {
  val androidSmallSixteenModel: MutableLiveData<AndroidSmallSixteenModel> =
      MutableLiveData(AndroidSmallSixteenModel())

  var navArguments: Bundle? = null
}
