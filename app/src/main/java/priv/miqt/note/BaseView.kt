package priv.miqt.note

/**
 * Created by miqt on 2018/3/14.
 */

interface BaseView<in T> {
    fun setPresenter(presenter: T)
}
