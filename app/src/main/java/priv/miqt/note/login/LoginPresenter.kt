package priv.miqt.note.login

import priv.miqt.note.BasePresenter

/**
 * Created by Administrator on 2018/3/14.
 */

interface LoginPresenter : BasePresenter<LoginView> {
    fun login()

    fun logout()
}
