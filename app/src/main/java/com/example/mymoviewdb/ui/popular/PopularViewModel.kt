package com.example.mymoviewdb.ui.popular

import android.app.Application
import android.icu.text.CaseMap
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mymoviewdb.networks.responses.ListMovieCominSoonResponse
import com.example.mymoviewdb.networks.responses.ResultCominSoon
import com.example.mymoviewdb.repository.FavoriteRepository
import com.example.mymoviewdb.repository.PopularRepository
import com.example.mymoviewdb.room.Popular
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PopularViewModel @Inject constructor(
    private val mPopularRepository: PopularRepository
):ViewModel(){

    fun getAllPopulars() {
        CoroutineScope(Dispatchers.IO).launch {
            mPopularRepository.seedDataPopulars()
        }
    }

    fun search(title: String?) : LiveData<List<Popular>> = mPopularRepository.searchMovies(title)

}