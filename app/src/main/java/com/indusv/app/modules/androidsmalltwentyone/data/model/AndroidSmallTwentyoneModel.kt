package com.indusv.app.modules.androidsmalltwentyone.`data`.model

import com.indusv.app.R
import com.indusv.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidSmallTwentyoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_admin2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdminId: String? = MyApp.getInstance().resources.getString(R.string.lbl_admin_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFortyTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFortyOneValue: String? = null
)
