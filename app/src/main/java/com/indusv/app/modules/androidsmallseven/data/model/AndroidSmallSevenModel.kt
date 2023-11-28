package com.indusv.app.modules.androidsmallseven.`data`.model

import com.indusv.app.R
import com.indusv.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidSmallSevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtINDUSMOTORS: String? = MyApp.getInstance().resources.getString(R.string.lbl_indus_motors2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSorryuserdeta: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sorry_user_deta)
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
