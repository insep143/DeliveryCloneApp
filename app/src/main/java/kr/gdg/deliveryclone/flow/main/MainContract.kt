package kr.gdg.deliveryclone.flow.main

import kr.gdg.deliveryclone.mvp.BaseMvpPresenter
import kr.gdg.deliveryclone.mvp.BaseMvpView

object MainContract {
    interface View : BaseMvpView {
        fun updateView(count : Int)
    }

    interface Presenter : BaseMvpPresenter<View> {
        fun getAddr(lat: Double, lng: Double)
        fun addCount(count : Int)
    }
}