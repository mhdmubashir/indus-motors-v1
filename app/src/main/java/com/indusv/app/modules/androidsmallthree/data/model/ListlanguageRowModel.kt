package com.indusv.app.modules.androidsmallthree.`data`.model

import com.indusv.app.R
import com.indusv.app.appcomponents.di.MyApp
import kotlin.String

data class ListlanguageRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_create_an_accou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_an_accou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_an_accou)

)
