package priv.miqt.note.login

import android.app.Activity
import android.content.Context
import priv.miqt.note.BaseView
import priv.miqt.note.app.AppView
import kotlin.coroutines.experimental.coroutineContext

/**
 * Created by Administrator on 2018/3/14.
 */

class LoginPresenterImpl(activity: Activity) : LoginPresenter {
    private var appview: AppView

    override fun start() {

    }

    override fun login() {

    }

    override fun logout() {

    }

    override fun setView(view: LoginView) {

    }

    init {
        appview = activity.application as AppView
    }
}
