package com.indusv.app.modules.androidsmallnine.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.indusv.app.R
import com.indusv.app.appcomponents.base.BaseActivity
import com.indusv.app.databinding.ActivityAndroidSmallNineBinding
import com.indusv.app.modules.androidsmallnine.`data`.viewmodel.AndroidSmallNineVM
import com.indusv.app.modules.androidsmallseven.ui.AndroidSmallSevenActivity
import com.indusv.app.modules.androidsmalltwo.ui.AndroidSmallTwoActivity
import kotlin.String
import kotlin.Unit

class AndroidSmallNineActivity :
    BaseActivity<ActivityAndroidSmallNineBinding>(R.layout.activity_android_small_nine) {
  private val viewModel: AndroidSmallNineVM by viewModels<AndroidSmallNineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidSmallNineVM = viewModel
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
    const val TAG: String = "ANDROID_SMALL_NINE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidSmallNineActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
