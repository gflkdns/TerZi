package priv.miqt.note

/**
 * Created by miqt on 2018/3/14.
 */

interface BasePresenter<in T : BaseView<*>> {

    fun setView(view: T)

    fun start()
}
