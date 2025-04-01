plugins {
    kotlin("jvm")
}

configurations.all {
    resolutionStrategy {
        dependencySubstitution {
            substitute(module("com.library:my-library"))
                .using(project(":my-library"))
        }
    }
}

dependencies {
    testImplementation(testFixtures("com.library:included-library:LOCAL"))
    testImplementation(testFixtures("com.library:my-library:LOCAL"))
}
