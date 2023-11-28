package com.indusv.app.modules.androidsmallthirteen.`data`.model

import com.indusv.app.R
import com.indusv.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidSmallThirteenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDidtheservici: String? =
      MyApp.getInstance().resources.getString(R.string.msg_did_the_servici)
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
