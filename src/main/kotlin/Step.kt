import com.github.kittinunf.fuel.core.Method
import java.util.*

class Step(
    var name: String,
    var descr: String,
    var type: TestType,
    var method: Method,
    var url: String,
    var expected: String
){
    val id: UUID = UUID.randomUUID()
}