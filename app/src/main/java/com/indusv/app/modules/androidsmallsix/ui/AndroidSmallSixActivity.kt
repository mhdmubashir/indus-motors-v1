package com.indusv.app.modules.androidsmallsix.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.indusv.app.R
import com.indusv.app.appcomponents.base.BaseActivity
import com.indusv.app.databinding.ActivityAndroidSmallSixBinding
import com.indusv.app.modules.androidsmallseven.ui.AndroidSmallSevenActivity
import com.indusv.app.modules.androidsmallsix.`data`.viewmodel.AndroidSmallSixVM
import com.indusv.app.modules.androidsmallthirteen.ui.AndroidSmallThirteenActivity
import com.indusv.app.modules.androidsmalltwo.ui.AndroidSmallTwoActivity
import kotlin.String
import kotlin.Unit

class AndroidSmallSixActivity :
    BaseActivity<ActivityAndroidSmallSixBinding>(R.layout.activity_android_small_six) {
  private val viewModel: AndroidSmallSixVM by viewModels<AndroidSmallSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidSmallSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIcons8homeTwentyFour.setOnClickListener {
      val destIntent = AndroidSmallTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBad.setOnClickListener {
      val destIntent = AndroidSmallThirteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnAverage.setOnClickListener {
      val destIntent = AndroidSmallThirteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnGood.setOnClickListener {
      val destIntent = AndroidSmallThirteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcons8backTwentyFour.setOnClickListener {
      val destIntent = AndroidSmallTwoActivity.getIntent(this, null)
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
    binding.btnExcellent.setOnClickListener {
      val destIntent = AndroidSmallThirteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_SMALL_SIX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidSmallSixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
