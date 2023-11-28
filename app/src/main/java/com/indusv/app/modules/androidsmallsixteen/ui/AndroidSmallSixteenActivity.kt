package com.indusv.app.modules.androidsmallsixteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.indusv.app.R
import com.indusv.app.appcomponents.base.BaseActivity
import com.indusv.app.databinding.ActivityAndroidSmallSixteenBinding
import com.indusv.app.modules.androidsmalleight.ui.AndroidSmallEightActivity
import com.indusv.app.modules.androidsmallfifteen.ui.AndroidSmallFifteenActivity
import com.indusv.app.modules.androidsmallseven.ui.AndroidSmallSevenActivity
import com.indusv.app.modules.androidsmallsixteen.`data`.viewmodel.AndroidSmallSixteenVM
import com.indusv.app.modules.androidsmalltwo.ui.AndroidSmallTwoActivity
import kotlin.String
import kotlin.Unit

class AndroidSmallSixteenActivity :
    BaseActivity<ActivityAndroidSmallSixteenBinding>(R.layout.activity_android_small_sixteen) {
  private val viewModel: AndroidSmallSixteenVM by viewModels<AndroidSmallSixteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidSmallSixteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSubmit.setOnClickListener {
      val destIntent = AndroidSmallEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnVeryUnlikely.setOnClickListener {
      val destIntent = AndroidSmallEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnUnlikely.setOnClickListener {
      val destIntent = AndroidSmallEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtHome.setOnClickListener {
      val destIntent = AndroidSmallTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnLikely.setOnClickListener {
      val destIntent = AndroidSmallEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnVeryLikely.setOnClickListener {
      val destIntent = AndroidSmallEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcons8homeTwentyFour.setOnClickListener {
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
      val destIntent = AndroidSmallFifteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_SMALL_SIXTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidSmallSixteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
