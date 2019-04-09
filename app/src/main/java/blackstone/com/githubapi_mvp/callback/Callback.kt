package blackstone.com.githubapi_mvp.callback

abstract class Callback<Any> {

    abstract fun returnResult(any: Any)
    abstract fun returnError(msg : String)

}