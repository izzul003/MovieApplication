package com.example.mymoviewdb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.ui.AppBarConfiguration
import com.example.mymoviewdb.databinding.ActivityMainBinding
import com.example.mymoviewdb.ui.favorite.FavoriteFragment
import com.example.mymoviewdb.ui.home.HomeFragment
import com.example.mymoviewdb.ui.location.LocationFragment
import com.example.mymoviewdb.ui.popular.PopularFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        //penyebab error
        if(savedInstanceState == null){
            loadFragment(HomeFragment())
        }

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_popular,
                R.id.navigation_favorite,
                R.id.navigation_location
            )
        )

        onNavigationItemSelected()
    }

    private fun onNavigationItemSelected() {
        binding?.navView?.setOnItemSelectedListener { item->
            when (item.itemId) {
                R.id.navigation_home -> {
                    loadFragment(HomeFragment())
                }

                R.id.navigation_popular -> {
                    loadFragment(PopularFragment())
                }

                R.id.navigation_favorite -> {
                    loadFragment(FavoriteFragment())
                }

                R.id.navigation_location-> {
                    loadFragment(LocationFragment())
                }
            }

            true
        }
    }

    private fun loadFragment(fragment: Fragment?) {
        if(fragment != null){
            val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.nav_host_fragment, fragment)
            transaction.commit()
        }
    }
}