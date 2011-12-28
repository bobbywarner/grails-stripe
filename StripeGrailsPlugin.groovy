class StripeGrailsPlugin {
    def version = "1.0.M1"
    def grailsVersion = "1.3.7 > *"
    def dependsOn = [:]

    def title = "Stripe"
    def author = "Bobby Warner"
    def authorEmail = "bobbywarner@gmail.com"
    def description = "Plugin for using Stripe to process credit card transactions."
    def documentation = "http://grails.org/plugin/stripe"
    def license = "APACHE"
    def issueManagement = [ system: "GitHub", url: "https://github.com/bobbywarner/grails-stripe/issues" ]
    def scm = [ url: "https://github.com/bobbywarner/grails-ruby" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
