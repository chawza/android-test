package com.example.navtgest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavHost
import com.example.navtgest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        binding!!.continueButton.setOnClickListener {
            val navHost = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHost
            val current_id = navHost.navController.currentDestination?.id

            val actionId = when (current_id) {
                R.id.profile -> R.id.action_profile_to_idcard
                R.id.idcard -> R.id.action_idcard_to_domicile
                R.id.domicile -> R.id.action_domicile_to_profile
                else -> R.id.action_profile_to_idcard
            }

            navHost.navController.navigate(actionId)
        }
    }

    public fun setGlobalText(text: String) {
        binding!!.globalText.text = text
    }
}
