package com.indusv.app.modules.androidsmalltwelve.`data`.model

import com.indusv.app.R
import com.indusv.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidSmallTwelveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtINDUSMOTORS: String? = MyApp.getInstance().resources.getString(R.string.lbl_indus_motors2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSwift: String? = MyApp.getInstance().resources.getString(R.string.lbl_swift)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_99_lakhs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDzireisa5se: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dzire_is_a_5_se)
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
