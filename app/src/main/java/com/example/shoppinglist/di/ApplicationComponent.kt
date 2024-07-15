package com.example.shoppinglist.di

import android.app.Application
import com.example.shoppinglist.data.ShopListProvider
import com.example.shoppinglist.presentation.MainActivity
import com.example.shoppinglist.presentation.ShopItemFragment
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(
    modules = [
        DataModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    fun inject(shopItemFragment: ShopItemFragment)

    fun inject(shopListProvider: ShopListProvider)

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance application: Application
        ): ApplicationComponent
    }
}