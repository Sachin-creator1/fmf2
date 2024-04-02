package com.bcasapplication.app.modules.androidlargefour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bcasapplication.app.modules.androidlargefour.`data`.model.AndroidLargeFourModel
import com.bcasapplication.app.modules.androidlargefour.`data`.model.SpinnerChangeyourModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AndroidLargeFourVM : ViewModel(), KoinComponent {
  val androidLargeFourModel: MutableLiveData<AndroidLargeFourModel> =
      MutableLiveData(AndroidLargeFourModel())

  var navArguments: Bundle? = null

  val spinnerChangeyourList: MutableLiveData<MutableList<SpinnerChangeyourModel>> =
      MutableLiveData()
}
