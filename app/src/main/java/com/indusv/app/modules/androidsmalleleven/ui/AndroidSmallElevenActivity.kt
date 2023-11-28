package com.indusv.app.modules.androidsmalleleven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.indusv.app.R
import com.indusv.app.appcomponents.base.BaseActivity
import com.indusv.app.databinding.ActivityAndroidSmallElevenBinding
import com.indusv.app.modules.androidsmalleleven.`data`.viewmodel.AndroidSmallElevenVM
import com.indusv.app.modules.androidsmallseven.ui.AndroidSmallSevenActivity
import com.indusv.app.modules.androidsmalltwo.ui.AndroidSmallTwoActivity
import kotlin.String
import kotlin.Unit

class AndroidSmallElevenActivity :
    BaseActivity<ActivityAndroidSmallElevenBinding>(R.layout.activity_android_small_eleven) {
  private val viewModel: AndroidSmallElevenVM by viewModels<AndroidSmallElevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidSmallElevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtHome.setOnClickListener {
      val destIntent = AndroidSmallTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtUser.setOnClickListener {
      val destIntent = AndroidSmallSevenActivity.getIntent(this, null)
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
  }

  companion object {
    const val TAG: String = "ANDROID_SMALL_ELEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidSmallElevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
