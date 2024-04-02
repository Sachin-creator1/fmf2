package com.bcasapplication.app.modules.androidlargefive.ui

import androidx.activity.viewModels
import com.bcasapplication.app.R
import com.bcasapplication.app.appcomponents.base.BaseActivity
import com.bcasapplication.app.databinding.ActivityAndroidLargeFiveBinding
import com.bcasapplication.app.modules.androidlargefive.`data`.viewmodel.AndroidLargeFiveVM
import kotlin.String
import kotlin.Unit

class AndroidLargeFiveActivity :
    BaseActivity<ActivityAndroidLargeFiveBinding>(R.layout.activity_android_large_five) {
  private val viewModel: AndroidLargeFiveVM by viewModels<AndroidLargeFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_FIVE_ACTIVITY"

  }
}
