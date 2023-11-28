package com.indusv.app.modules.androidsmalleighteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.indusv.app.R
import com.indusv.app.appcomponents.base.BaseActivity
import com.indusv.app.databinding.ActivityAndroidSmallEighteenBinding
import com.indusv.app.modules.androidsmalleighteen.`data`.viewmodel.AndroidSmallEighteenVM
import com.indusv.app.modules.androidsmallthree.ui.AndroidSmallThreeActivity
import com.indusv.app.modules.androidsmalltwentyone.ui.AndroidSmallTwentyoneActivity
import kotlin.String
import kotlin.Unit

class AndroidSmallEighteenActivity :
    BaseActivity<ActivityAndroidSmallEighteenBinding>(R.layout.activity_android_small_eighteen) {
  private val viewModel: AndroidSmallEighteenVM by viewModels<AndroidSmallEighteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidSmallEighteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAdmin.setOnClickListener {
      val destIntent = AndroidSmallTwentyoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnUser.setOnClickListener {
      val destIntent = AndroidSmallThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_SMALL_EIGHTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidSmallEighteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
