grails.project.work.dir = "target"

grails.project.dependency.resolution = {
    
    inherits "global"
    log "warn"

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        compile 'com.stripe:stripe-java:1.2.2'
    }

    plugins {
        compile ":resources:1.2"
        build ":release:2.2.1", ":rest-client-builder:1.0.3", {
            export = false
        }
    }
}
