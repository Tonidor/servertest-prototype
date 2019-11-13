import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.core.Method

class StatusCode(
    override val method: Method,
    override val url: String,
    var expected: Int
) : TestJob {

    override fun execute(): Boolean {
        val httpResponse = when (method) {
            Method.POST -> Fuel.post(url)
            else -> Fuel.get(url)
        }

        var toReturn: Boolean = false
       // return httpResponse.response().second.statusCode == expected
        httpResponse.response { request, response, result -> toReturn = response.statusCode.equals(expected) }
//        println(httpResponse.response().second.statusCode)
//        println(httpResponse.response().second.body().asString("application/json"))
        println(toReturn)
        return toReturn
    }
}