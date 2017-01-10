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
        compile 'com.stripe:stripe-java:3.5.0'
    }

    plugins {
        compile ":asset-pipeline:2.5.7"
        build(':release:3.1.2')
    }
}
