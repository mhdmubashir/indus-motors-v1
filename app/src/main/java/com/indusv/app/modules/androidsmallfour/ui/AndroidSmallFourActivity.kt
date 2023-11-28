package com.indusv.app.modules.androidsmallfour.ui

import androidx.activity.viewModels
import com.indusv.app.R
import com.indusv.app.appcomponents.base.BaseActivity
import com.indusv.app.databinding.ActivityAndroidSmallFourBinding
import com.indusv.app.modules.androidsmallfour.`data`.viewmodel.AndroidSmallFourVM
import com.indusv.app.modules.androidsmallthree.ui.AndroidSmallThreeActivity
import kotlin.String
import kotlin.Unit

class AndroidSmallFourActivity :
    BaseActivity<ActivityAndroidSmallFourBinding>(R.layout.activity_android_small_four) {
  private val viewModel: AndroidSmallFourVM by viewModels<AndroidSmallFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidSmallFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLogin.setOnClickListener {
      val destIntent = AndroidSmallThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_SMALL_FOUR_ACTIVITY"

  }
}
