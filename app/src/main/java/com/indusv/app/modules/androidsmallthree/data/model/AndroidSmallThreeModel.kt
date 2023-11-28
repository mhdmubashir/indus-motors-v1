package com.indusv.app.modules.androidsmallthree.`data`.model

import com.indusv.app.R
import com.indusv.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidSmallThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCustomerId: String? = MyApp.getInstance().resources.getString(R.string.lbl_customer_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCustomerIdOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_customer_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCustomerIdTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_customer_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEntercustomer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_customer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEntercustomerOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_customer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPasswordOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPasswordTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryourpass: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_pass)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryourpassOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_pass)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFiftySixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFiftyFiveValue: String? = null
)
