package com.bcasapplication.app.modules.androidlargethree.`data`.model

import com.bcasapplication.app.R
import com.bcasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFindmyfolks: String? = MyApp.getInstance().resources.getString(R.string.lbl_find_my_folks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHitherehere: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hi_there_here_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThankyou: String? = MyApp.getInstance().resources.getString(R.string.lbl_thank_you)

)
