package com.indusv.app.modules.androidsmalleighteen.`data`.model

import com.indusv.app.R
import com.indusv.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidSmallEighteenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIndusmotors: String? = MyApp.getInstance().resources.getString(R.string.lbl_indusmotors)

)
