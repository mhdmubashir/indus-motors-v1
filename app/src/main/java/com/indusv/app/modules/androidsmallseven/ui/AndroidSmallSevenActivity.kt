package com.indusv.app.modules.androidsmallseven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.indusv.app.R
import com.indusv.app.appcomponents.base.BaseActivity
import com.indusv.app.databinding.ActivityAndroidSmallSevenBinding
import com.indusv.app.modules.androidsmallseven.`data`.viewmodel.AndroidSmallSevenVM
import com.indusv.app.modules.androidsmallsix.ui.AndroidSmallSixActivity
import com.indusv.app.modules.androidsmalltwo.ui.AndroidSmallTwoActivity
import kotlin.String
import kotlin.Unit

class AndroidSmallSevenActivity :
    BaseActivity<ActivityAndroidSmallSevenBinding>(R.layout.activity_android_small_seven) {
  private val viewModel: AndroidSmallSevenVM by viewModels<AndroidSmallSevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidSmallSevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtHome.setOnClickListener {
      val destIntent = AndroidSmallTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtFeedback.setOnClickListener {
      val destIntent = AndroidSmallSixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcons8backTwentyFour.setOnClickListener {
      val destIntent = AndroidSmallTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_SMALL_SEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidSmallSevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
