import com.github.kittinunf.fuel.core.Method
import java.util.*

interface TestJob {
    val method: Method
    val url: String

    fun execute(): Boolean
}