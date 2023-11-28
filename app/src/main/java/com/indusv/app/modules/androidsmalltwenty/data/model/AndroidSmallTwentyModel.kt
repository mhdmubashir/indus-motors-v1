package com.indusv.app.modules.androidsmalltwenty.`data`.model

import com.indusv.app.R
import com.indusv.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidSmallTwentyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtINDUSMOTORS: String? = MyApp.getInstance().resources.getString(R.string.lbl_indus_motors2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSorrycurrently: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sorry_currently)

)
