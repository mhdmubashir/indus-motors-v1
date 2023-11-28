package com.indusv.app.modules.androidsmalleleven.`data`.model

import com.indusv.app.R
import com.indusv.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidSmallElevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtINDUSMOTORS: String? = MyApp.getInstance().resources.getString(R.string.lbl_indus_motors2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_baleno)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_6_66_lakhs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_engine_1197cc)
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
