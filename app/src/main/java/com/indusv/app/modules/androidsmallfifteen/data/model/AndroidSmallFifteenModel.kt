package com.indusv.app.modules.androidsmallfifteen.`data`.model

import com.indusv.app.R
import com.indusv.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidSmallFifteenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDidthecarser: String? =
      MyApp.getInstance().resources.getString(R.string.msg_did_the_car_ser)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_breakdown_pr)
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
