package priv.miqt.note.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

import priv.miqt.note.R
import priv.miqt.note.app.App
import priv.miqt.note.app.AppView

class LoginActivity : AppCompatActivity(), LoginView {

    private lateinit var loginPresenter: LoginPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginPresenter = LoginPresenterImpl(this)
        setPresenter(loginPresenter)
    }

    override fun onResume() {
        super.onResume()
        loginPresenter.start()
    }

    override fun setPresenter(presenter: LoginPresenter) {
        presenter.setView(this)
    }


    override fun loging() {

    }

    override fun loginSuccess() {

    }

    override fun loginError() {

    }

    override fun logout() {

    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.bt_login -> {
                loginPresenter.login()
            }
            R.id.bt_logout -> {
                loginPresenter.logout()
            }
        }

    }
}
