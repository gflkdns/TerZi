package priv.miqt.note.app

import android.app.Application
import android.content.pm.ApplicationInfo
import android.widget.Toast

import com.isnc.facesdk.SuperID

import priv.miqt.note.BasePresenter

/**
 * Created by miqt on 2018/3/14.
 */

class App : Application(), AppView {
    override fun setPresenter(presenter: AppPresenter) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate() {
        super.onCreate()
        initSuperid()
    }

    /**
     * 初始化一登SDK
     */
    private fun initSuperid() {
        //由于initFaceSDK需要执行网络请求，所以建议应用开屏欢迎页有个2-3秒左右的过渡，并在该页面添加此接口。
        SuperID.initFaceSDK(this)
        SuperID.setDebugMode(true)
    }


    override fun toast(s: String) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
    }

    override fun notyfycation(title: String, msg: String, image: String) {

    }
}
