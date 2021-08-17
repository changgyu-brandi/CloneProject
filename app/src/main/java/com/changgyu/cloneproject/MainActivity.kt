package com.changgyu.cloneproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.changgyu.cloneproject.databinding.ActivityMainBinding
import com.changgyu.cloneproject.util.setupWithNavController

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNavigationBar()
    }

    private fun setupBottomNavigationBar() {

        val navGraphIds = listOf(
            R.navigation.nav_home,
            R.navigation.nav_category,
            R.navigation.nav_bookmark,
            R.navigation.nav_mypage
        )

       navController = binding.gnb.setupWithNavController(
            navGraphIds, supportFragmentManager, R.id.fcv, intent
        )

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.value?.navigateUp() ?: false
    }

    override fun onBackPressed() {
        if(navController.value?.popBackStack()==false){
            super.onBackPressed()
        }

    }

    companion object{
        lateinit var navController: LiveData<NavController>

        fun rootNavController(): NavController? {
            return navController.value
        }
    }

}