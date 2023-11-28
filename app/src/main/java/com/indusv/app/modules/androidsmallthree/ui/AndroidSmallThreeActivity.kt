package com.indusv.app.modules.androidsmallthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.indusv.app.R
import com.indusv.app.appcomponents.base.BaseActivity
import com.indusv.app.databinding.ActivityAndroidSmallThreeBinding
import com.indusv.app.modules.androidsmallthree.`data`.model.ListlanguageRowModel
import com.indusv.app.modules.androidsmallthree.`data`.viewmodel.AndroidSmallThreeVM
import com.indusv.app.modules.androidsmalltwo.ui.AndroidSmallTwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AndroidSmallThreeActivity :
    BaseActivity<ActivityAndroidSmallThreeBinding>(R.layout.activity_android_small_three) {
  private val viewModel: AndroidSmallThreeVM by viewModels<AndroidSmallThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listlanguageAdapter =
    ListlanguageAdapter(viewModel.listlanguageList.value?:mutableListOf())
    binding.recyclerListlanguage.adapter = listlanguageAdapter
    listlanguageAdapter.setOnItemClickListener(
    object : ListlanguageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlanguageRowModel) {
        onClickRecyclerListlanguage(view, position, item)
      }
    }
    )
    viewModel.listlanguageList.observe(this) {
      listlanguageAdapter.updateData(it)
    }
    binding.androidSmallThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLogin.setOnClickListener {
      val destIntent = AndroidSmallTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLogin.setOnClickListener {
      val destIntent = AndroidSmallTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnLoginTwo.setOnClickListener {
      val destIntent = AndroidSmallTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListlanguage(
    view: View,
    position: Int,
    item: ListlanguageRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ANDROID_SMALL_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidSmallThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
