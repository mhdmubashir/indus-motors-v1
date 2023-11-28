package com.indusv.app.modules.androidsmalltwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.indusv.app.R
import com.indusv.app.appcomponents.base.BaseActivity
import com.indusv.app.databinding.ActivityAndroidSmallTwoBinding
import com.indusv.app.modules.androidsmalleighteen.ui.AndroidSmallEighteenActivity
import com.indusv.app.modules.androidsmalleleven.ui.AndroidSmallElevenActivity
import com.indusv.app.modules.androidsmallnine.ui.AndroidSmallNineActivity
import com.indusv.app.modules.androidsmallseven.ui.AndroidSmallSevenActivity
import com.indusv.app.modules.androidsmallsix.ui.AndroidSmallSixActivity
import com.indusv.app.modules.androidsmallten.ui.AndroidSmallTenActivity
import com.indusv.app.modules.androidsmalltwelve.ui.AndroidSmallTwelveActivity
import com.indusv.app.modules.androidsmalltwo.`data`.viewmodel.AndroidSmallTwoVM
import kotlin.String
import kotlin.Unit

class AndroidSmallTwoActivity :
    BaseActivity<ActivityAndroidSmallTwoBinding>(R.layout.activity_android_small_two) {
  private val viewModel: AndroidSmallTwoVM by viewModels<AndroidSmallTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidSmallTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIcons8logoutTwo.setOnClickListener {
      val destIntent = AndroidSmallEighteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSixteen.setOnClickListener {
      val destIntent = AndroidSmallNineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleFifteen.setOnClickListener {
      val destIntent = AndroidSmallElevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleEighteen.setOnClickListener {
      val destIntent = AndroidSmallTenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSeventeen.setOnClickListener {
      val destIntent = AndroidSmallTwelveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLanguageOne.setOnClickListener {
      val destIntent = AndroidSmallElevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtFeedback.setOnClickListener {
      val destIntent = AndroidSmallSixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtUser.setOnClickListener {
      val destIntent = AndroidSmallSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSwift.setOnClickListener {
      val destIntent = AndroidSmallTwelveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtAlto.setOnClickListener {
      val destIntent = AndroidSmallTenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_SMALL_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidSmallTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
