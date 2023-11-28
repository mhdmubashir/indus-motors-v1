package com.indusv.app.modules.androidsmalltwenty.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.indusv.app.R
import com.indusv.app.appcomponents.base.BaseActivity
import com.indusv.app.databinding.ActivityAndroidSmallTwentyBinding
import com.indusv.app.modules.androidsmalleighteen.ui.AndroidSmallEighteenActivity
import com.indusv.app.modules.androidsmalltwenty.`data`.viewmodel.AndroidSmallTwentyVM
import kotlin.String
import kotlin.Unit

class AndroidSmallTwentyActivity :
    BaseActivity<ActivityAndroidSmallTwentyBinding>(R.layout.activity_android_small_twenty) {
  private val viewModel: AndroidSmallTwentyVM by viewModels<AndroidSmallTwentyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidSmallTwentyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIcons8logoutTwo.setOnClickListener {
      val destIntent = AndroidSmallEighteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_SMALL_TWENTY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidSmallTwentyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
