package com.arunwichsapplication.app.modules.account.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arunwichsapplication.app.R
import com.arunwichsapplication.app.appcomponents.base.BaseActivity
import com.arunwichsapplication.app.databinding.ActivityAccountBinding
import com.arunwichsapplication.app.modules.account.`data`.viewmodel.AccountVM
import kotlin.String
import kotlin.Unit

class AccountActivity : BaseActivity<ActivityAccountBinding>(R.layout.activity_account) {
  private val viewModel: AccountVM by viewModels<AccountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ACCOUNT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
