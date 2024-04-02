package com.bcasapplication.app.modules.androidlargeone.`data`.model

import com.bcasapplication.app.R
import com.bcasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFindmyfolks: String? = MyApp.getInstance().resources.getString(R.string.lbl_find_my_folks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIlluminateyour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_illuminate_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_find)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etActionOneValue: String? = null
)
