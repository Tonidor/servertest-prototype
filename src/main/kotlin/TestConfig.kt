import java.util.*

class TestConfig (
    var name: String,
    var descr: String,
    var schedule: String,
    //var label: Label,
    var subscribers: MutableList<String>,
    var steps: MutableList<Step>
){
    val id: UUID = UUID.randomUUID()
    var jobs: MutableList<TestJob> = mutableListOf()

    init {
        for (step in steps){
            jobs.add(TestFactory.create(step))
        }
        for (job in jobs){
            job.execute()
        }
    }
}