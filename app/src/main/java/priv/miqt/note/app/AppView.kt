package priv.miqt.note.app

import priv.miqt.note.BasePresenter
import priv.miqt.note.BaseView

/**
 * Created by miqt on 2018/3/14.
 */

interface AppView : BaseView<AppPresenter> {
    fun toast(s: String)

    fun notyfycation(title: String, msg: String, image: String)
}
