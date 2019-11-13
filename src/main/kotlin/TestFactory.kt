object TestFactory {

    fun create(step: Step): TestJob {
        return when(step.type){
            TestType.STATUSCODE -> StatusCode(step.method, step.url, step.expected.toInt())
            else -> StatusCode(step.method, step.url, step.expected.toInt())
        }
    }
}