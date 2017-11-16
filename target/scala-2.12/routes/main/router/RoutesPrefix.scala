
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/PlayApps/HelloWorld/conf/routes
// @DATE:Thu Nov 16 10:24:13 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
