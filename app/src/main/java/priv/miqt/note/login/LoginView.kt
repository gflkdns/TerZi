package priv.miqt.note.login

import priv.miqt.note.BaseView

/**
 * Created by Administrator on 2018/3/14.
 */

interface LoginView : BaseView<LoginPresenter> {
    fun loging()

    fun loginSuccess()

    fun loginError()

    fun logout()
}
