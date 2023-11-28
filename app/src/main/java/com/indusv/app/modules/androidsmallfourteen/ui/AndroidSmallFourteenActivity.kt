package com.indusv.app.modules.androidsmallfourteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.indusv.app.R
import com.indusv.app.appcomponents.base.BaseActivity
import com.indusv.app.databinding.ActivityAndroidSmallFourteenBinding
import com.indusv.app.modules.androidsmallfifteen.ui.AndroidSmallFifteenActivity
import com.indusv.app.modules.androidsmallfourteen.`data`.viewmodel.AndroidSmallFourteenVM
import com.indusv.app.modules.androidsmallseven.ui.AndroidSmallSevenActivity
import com.indusv.app.modules.androidsmallthirteen.ui.AndroidSmallThirteenActivity
import com.indusv.app.modules.androidsmalltwo.ui.AndroidSmallTwoActivity
import kotlin.String
import kotlin.Unit

class AndroidSmallFourteenActivity :
    BaseActivity<ActivityAndroidSmallFourteenBinding>(R.layout.activity_android_small_fourteen) {
  private val viewModel: AndroidSmallFourteenVM by viewModels<AndroidSmallFourteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidSmallFourteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDissatisfied.setOnClickListener {
      val destIntent = AndroidSmallFifteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtUser.setOnClickListener {
      val destIntent = AndroidSmallSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcons8backTwentyFour.setOnClickListener {
      val destIntent = AndroidSmallThirteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNeutral.setOnClickListener {
      val destIntent = AndroidSmallFifteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSatisfied.setOnClickListener {
      val destIntent = AndroidSmallFifteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnVerySatisfied.setOnClickListener {
      val destIntent = AndroidSmallFifteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtHome.setOnClickListener {
      val destIntent = AndroidSmallTwoActivity.getIntent(this, null)
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
  }

  companion object {
    const val TAG: String = "ANDROID_SMALL_FOURTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidSmallFourteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
