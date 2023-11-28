package com.indusv.app.modules.androidsmalleight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.indusv.app.R
import com.indusv.app.appcomponents.base.BaseActivity
import com.indusv.app.databinding.ActivityAndroidSmallEightBinding
import com.indusv.app.modules.androidsmalleight.`data`.viewmodel.AndroidSmallEightVM
import com.indusv.app.modules.androidsmalltwo.ui.AndroidSmallTwoActivity
import kotlin.String
import kotlin.Unit

class AndroidSmallEightActivity :
    BaseActivity<ActivityAndroidSmallEightBinding>(R.layout.activity_android_small_eight) {
  private val viewModel: AndroidSmallEightVM by viewModels<AndroidSmallEightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidSmallEightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtClick.setOnClickListener {
      val destIntent = AndroidSmallTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_SMALL_EIGHT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidSmallEightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
