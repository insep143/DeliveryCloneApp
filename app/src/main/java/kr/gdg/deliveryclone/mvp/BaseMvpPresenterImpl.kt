package kr.gdg.deliveryclone.mvp

open class BaseMvpPresenterImpl<T: BaseMvpView> : BaseMvpPresenter<T> {

    protected var mView: T? = null

    override fun attachView(view: T) {
        mView = view
    }

    override fun detachView() {
        mView = null
    }

}