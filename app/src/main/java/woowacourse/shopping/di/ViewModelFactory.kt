package woowacourse.shopping.di

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory

inline fun <reified T : ViewModel> inject(): ViewModelProvider.Factory =
    viewModelFactory {
        initializer {
            Log.d("123123", DependencyInjector.inject<T>().toString())
            DependencyInjector.inject<T>()
        }
    }
