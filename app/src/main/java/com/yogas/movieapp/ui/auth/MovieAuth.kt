package com.yogas.movieapp.ui.auth

import android.content.Context
import com.yogas.movieapp.data.model.ActionState
import com.yogas.movieapp.data.repository.AuthRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

object MovieAuth {

    fun logout(contex: Context, callback: ((ActionState<Boolean>) -> Unit)? = null) {
        val repo = AuthRepository(contex)
        CoroutineScope(Dispatchers.IO).launch {
            val resp = repo.logout()
            withContext(Dispatchers.Main) {
                if (callback != null) callback.invoke(resp)
            }
        }
    }
}