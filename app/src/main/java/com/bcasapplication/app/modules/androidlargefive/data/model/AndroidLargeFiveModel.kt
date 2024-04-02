package com.bcasapplication.app.modules.androidlargefive.`data`.model

import com.bcasapplication.app.R
import com.bcasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeFiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFindmyfolks: String? = MyApp.getInstance().resources.getString(R.string.lbl_find_my_folks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryourname: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_enter_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryour: String? = MyApp.getInstance().resources.getString(R.string.msg_enter_your_phone)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryourOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_relative_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etNameOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPhonenumberOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etMobileNoValue: String? = null
)
