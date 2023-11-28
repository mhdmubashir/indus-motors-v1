package com.indusv.app.modules.androidsmallthirteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.indusv.app.R
import com.indusv.app.appcomponents.base.BaseActivity
import com.indusv.app.databinding.ActivityAndroidSmallThirteenBinding
import com.indusv.app.modules.androidsmallfourteen.ui.AndroidSmallFourteenActivity
import com.indusv.app.modules.androidsmallseven.ui.AndroidSmallSevenActivity
import com.indusv.app.modules.androidsmallsix.ui.AndroidSmallSixActivity
import com.indusv.app.modules.androidsmallthirteen.`data`.viewmodel.AndroidSmallThirteenVM
import com.indusv.app.modules.androidsmalltwo.ui.AndroidSmallTwoActivity
import kotlin.String
import kotlin.Unit

class AndroidSmallThirteenActivity :
    BaseActivity<ActivityAndroidSmallThirteenBinding>(R.layout.activity_android_small_thirteen) {
  private val viewModel: AndroidSmallThirteenVM by viewModels<AndroidSmallThirteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidSmallThirteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSignificantlyDelayed.setOnClickListener {
      val destIntent = AndroidSmallFourteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSlightlyDelayedOne.setOnClickListener {
      val destIntent = AndroidSmallFourteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnYesOnTime.setOnClickListener {
      val destIntent = AndroidSmallFourteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtHome.setOnClickListener {
      val destIntent = AndroidSmallTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtFeedback.setOnClickListener {
      val destIntent = AndroidSmallSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtUser.setOnClickListener {
      val destIntent = AndroidSmallSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcons8backTwentyFour.setOnClickListener {
      val destIntent = AndroidSmallSixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcons8homeTwentyFour.setOnClickListener {
      val destIntent = AndroidSmallTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNotCompleted.setOnClickListener {
      val destIntent = AndroidSmallFourteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_SMALL_THIRTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidSmallThirteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
