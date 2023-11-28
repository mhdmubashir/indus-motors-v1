package com.indusv.app.modules.androidsmallsixteen.`data`.model

import com.indusv.app.R
import com.indusv.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidSmallSixteenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFiftyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHowlikelyare: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_likely_are)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeedback: String? = MyApp.getInstance().resources.getString(R.string.lbl_feedback)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUser: String? = MyApp.getInstance().resources.getString(R.string.lbl_user)

)
