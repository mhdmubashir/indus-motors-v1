package com.indusv.app.modules.androidsmallthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.indusv.app.modules.androidsmallthree.`data`.model.AndroidSmallThreeModel
import com.indusv.app.modules.androidsmallthree.`data`.model.ListlanguageRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AndroidSmallThreeVM : ViewModel(), KoinComponent {
  val androidSmallThreeModel: MutableLiveData<AndroidSmallThreeModel> =
      MutableLiveData(AndroidSmallThreeModel())

  var navArguments: Bundle? = null

  val listlanguageList: MutableLiveData<MutableList<ListlanguageRowModel>> =
      MutableLiveData(mutableListOf())
}
