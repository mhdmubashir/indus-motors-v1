package com.indusv.app.modules.androidsmallfourteen.`data`.model

import com.indusv.app.R
import com.indusv.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidSmallFourteenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHowsatisfieda: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_satisfied_a)
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
