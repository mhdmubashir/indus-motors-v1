package com.indusv.app.modules.androidsmallfifteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.indusv.app.R
import com.indusv.app.appcomponents.base.BaseActivity
import com.indusv.app.databinding.ActivityAndroidSmallFifteenBinding
import com.indusv.app.modules.androidsmallfifteen.`data`.viewmodel.AndroidSmallFifteenVM
import com.indusv.app.modules.androidsmallfourteen.ui.AndroidSmallFourteenActivity
import com.indusv.app.modules.androidsmallseven.ui.AndroidSmallSevenActivity
import com.indusv.app.modules.androidsmallsixteen.ui.AndroidSmallSixteenActivity
import com.indusv.app.modules.androidsmalltwo.ui.AndroidSmallTwoActivity
import kotlin.String
import kotlin.Unit

class AndroidSmallFifteenActivity :
    BaseActivity<ActivityAndroidSmallFifteenBinding>(R.layout.activity_android_small_fifteen) {
  private val viewModel: AndroidSmallFifteenVM by viewModels<AndroidSmallFifteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidSmallFifteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNotVeryClear.setOnClickListener {
      val destIntent = AndroidSmallSixteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSomewhatClear.setOnClickListener {
      val destIntent = AndroidSmallSixteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnYesVeryClearOne.setOnClickListener {
      val destIntent = AndroidSmallSixteenActivity.getIntent(this, null)
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
      val destIntent = AndroidSmallFourteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcons8homeTwentyFour.setOnClickListener {
      val destIntent = AndroidSmallTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtHome.setOnClickListener {
      val destIntent = AndroidSmallTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupThirtyTwo.setOnClickListener {
      val destIntent = AndroidSmallSixteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_SMALL_FIFTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidSmallFifteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
