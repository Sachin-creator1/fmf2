package com.bcasapplication.app.modules.androidlargefour.ui

import androidx.activity.viewModels
import com.bcasapplication.app.R
import com.bcasapplication.app.appcomponents.base.BaseActivity
import com.bcasapplication.app.databinding.ActivityAndroidLargeFourBinding
import com.bcasapplication.app.modules.androidlargefour.`data`.model.SpinnerChangeyourModel
import com.bcasapplication.app.modules.androidlargefour.`data`.viewmodel.AndroidLargeFourVM
import kotlin.String
import kotlin.Unit

class AndroidLargeFourActivity :
    BaseActivity<ActivityAndroidLargeFourBinding>(R.layout.activity_android_large_four) {
  private val viewModel: AndroidLargeFourVM by viewModels<AndroidLargeFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerChangeyourList.value = mutableListOf(
    SpinnerChangeyourModel("Item1"),
    SpinnerChangeyourModel("Item2"),
    SpinnerChangeyourModel("Item3"),
    SpinnerChangeyourModel("Item4"),
    SpinnerChangeyourModel("Item5")
    )
    val spinnerChangeyourAdapter =
    SpinnerChangeyourAdapter(this,R.layout.spinner_item,viewModel.spinnerChangeyourList.value?:
    mutableListOf())
    binding.spinnerChangeyour.adapter = spinnerChangeyourAdapter
    binding.androidLargeFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_FOUR_ACTIVITY"

  }
}
