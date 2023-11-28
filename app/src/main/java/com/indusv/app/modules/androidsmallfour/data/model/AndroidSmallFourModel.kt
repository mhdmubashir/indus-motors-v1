package com.indusv.app.modules.androidsmallfour.`data`.model

import com.indusv.app.R
import com.indusv.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidSmallFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignup: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouAlreadyhav: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_already_hav)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFiftyThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFiftyTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFiftyOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFiftyValue: String? = null
)
