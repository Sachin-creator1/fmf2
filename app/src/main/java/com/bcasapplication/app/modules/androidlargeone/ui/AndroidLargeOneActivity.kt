package com.bcasapplication.app.modules.androidlargeone.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.bcasapplication.app.R
import com.bcasapplication.app.appcomponents.base.BaseActivity
import com.bcasapplication.app.databinding.ActivityAndroidLargeOneBinding
import com.bcasapplication.app.modules.androidlargeone.`data`.viewmodel.AndroidLargeOneVM
import com.bcasapplication.app.modules.androidlargetwo.ui.AndroidLargeTwoActivity
import kotlin.String
import kotlin.Unit

class AndroidLargeOneActivity :
    BaseActivity<ActivityAndroidLargeOneBinding>(R.layout.activity_android_large_one) {
  private val viewModel: AndroidLargeOneVM by viewModels<AndroidLargeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeOneVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = AndroidLargeTwoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "ANDROID_LARGE_ONE_ACTIVITY"

    }
  }
