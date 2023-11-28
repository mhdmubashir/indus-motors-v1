package com.indusv.app.modules.androidsmallten.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.indusv.app.R
import com.indusv.app.appcomponents.base.BaseActivity
import com.indusv.app.databinding.ActivityAndroidSmallTenBinding
import com.indusv.app.modules.androidsmallseven.ui.AndroidSmallSevenActivity
import com.indusv.app.modules.androidsmallten.`data`.viewmodel.AndroidSmallTenVM
import com.indusv.app.modules.androidsmalltwo.ui.AndroidSmallTwoActivity
import kotlin.String
import kotlin.Unit

class AndroidSmallTenActivity :
    BaseActivity<ActivityAndroidSmallTenBinding>(R.layout.activity_android_small_ten) {
  private val viewModel: AndroidSmallTenVM by viewModels<AndroidSmallTenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidSmallTenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtHome.setOnClickListener {
      val destIntent = AndroidSmallTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtFeedback.setOnClickListener {
      val destIntent = AndroidSmallSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcons8backTwentyFour.setOnClickListener {
      val destIntent = AndroidSmallTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtUser.setOnClickListener {
      val destIntent = AndroidSmallSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_SMALL_TEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidSmallTenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
