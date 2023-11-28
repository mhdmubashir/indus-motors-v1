package com.indusv.app.modules.androidsmalltwentyone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.indusv.app.R
import com.indusv.app.appcomponents.base.BaseActivity
import com.indusv.app.databinding.ActivityAndroidSmallTwentyoneBinding
import com.indusv.app.modules.androidsmalltwenty.ui.AndroidSmallTwentyActivity
import com.indusv.app.modules.androidsmalltwentyone.`data`.viewmodel.AndroidSmallTwentyoneVM
import kotlin.String
import kotlin.Unit

class AndroidSmallTwentyoneActivity :
    BaseActivity<ActivityAndroidSmallTwentyoneBinding>(R.layout.activity_android_small_twentyone) {
  private val viewModel: AndroidSmallTwentyoneVM by viewModels<AndroidSmallTwentyoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidSmallTwentyoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLogin.setOnClickListener {
      val destIntent = AndroidSmallTwentyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_SMALL_TWENTYONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidSmallTwentyoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
