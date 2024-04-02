package com.bcasapplication.app.modules.androidlargefour.`data`.model

import com.bcasapplication.app.R
import com.bcasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSetting: String? = MyApp.getInstance().resources.getString(R.string.lbl_setting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAbouttheapp: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_the_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGivefeedback: String? = MyApp.getInstance().resources.getString(R.string.lbl_give_feedback)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeyourOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeyourTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_your_phone)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeyour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_your_relative_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSave: String? = MyApp.getInstance().resources.getString(R.string.lbl_save)

)
