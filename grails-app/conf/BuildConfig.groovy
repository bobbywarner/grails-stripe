grails.project.work.dir = "target"

grails.project.dependency.resolver = 'maven'

grails.project.dependency.resolution = {

    inherits "global"
    log "warn"

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        compile 'com.stripe:stripe-java:1.17.0'
    }

    plugins {

        compile ":resources:1.2.8"

        build ':release:3.0.1', ':rest-client-builder:2.0.3', {
            export = false
        }
    }
}
