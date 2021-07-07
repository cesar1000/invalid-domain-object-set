@file:Suppress("UnstableApiUsage")

import org.gradle.api.services.BuildService
import org.gradle.api.services.BuildServiceParameters

abstract class MyBuildService : BuildService<MyBuildService.Parameters> {
    interface Parameters : BuildServiceParameters {
        val set: DomainObjectSet<String>
    }
}

gradle.sharedServices.registerIfAbsent("service", MyBuildService::class.java) {}.get()
