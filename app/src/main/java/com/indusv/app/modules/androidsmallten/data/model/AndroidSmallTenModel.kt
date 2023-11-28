package com.indusv.app.modules.androidsmallten.`data`.model

import com.indusv.app.R
import com.indusv.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidSmallTenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtINDUSMOTORS: String? = MyApp.getInstance().resources.getString(R.string.lbl_indus_motors2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlto: String? = MyApp.getInstance().resources.getString(R.string.lbl_alto)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_96_lakhs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5seater3cyli: String? =
      MyApp.getInstance().resources.getString(R.string.msg_5_seater_3_cyli)
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
