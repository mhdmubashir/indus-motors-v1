package com.indusv.app.modules.androidsmalleight.`data`.model

import com.indusv.app.R
import com.indusv.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidSmallEightModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThanksforfeed: String? =
      MyApp.getInstance().resources.getString(R.string.msg_thanks_for_feed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_back_to_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClick: String? = MyApp.getInstance().resources.getString(R.string.lbl_click)

)
