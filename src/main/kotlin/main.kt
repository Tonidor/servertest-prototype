import com.github.kittinunf.fuel.core.Method

fun main() {
    setup()
}

fun setup() {
    var testConfig = TestConfig(
        "MyConfig",
        "a description",
        "0 21 * * 1",
        getSubscribers(),
        getSteps())
    print(testConfig)
}

fun getSubscribers(): MutableList<String> {
    return mutableListOf("email0", "email1", "email2")
}

fun getSteps(): MutableList<Step> {
    return mutableListOf(
        Step(
            "step0",
            "a description",
            TestType.STATUSCODE,
            Method.GET,
            "https://pokeapi.co/api/v2/pokemon/ditto/",
            "200"
        ),
        Step(
            "step1",
            "a description",
            TestType.STATUSCODE,
            Method.GET,
            "https://pokeapi.co/api/v2/pokemon/pikachu/",
            "200"
        )
    )
}