class StripeGrailsPlugin {
    def version = "1.0"
    def grailsVersion = "1.3.7 > *"
    def dependsOn = ['resources':'1.1.6 > *']

    def title = "Stripe"
    def author = "Bobby Warner"
    def authorEmail = "bobbywarner@gmail.com"
    def description = "Plugin for using Stripe to process credit card transactions."
    def documentation = "http://bobbywarner.github.com/grails-stripe"
    def license = "APACHE"
    def issueManagement = [ system: "GitHub", url: "https://github.com/bobbywarner/grails-stripe/issues" ]
    def scm = [ url: "https://github.com/bobbywarner/grails-stripe" ]
    def developers = [ [ name: "Nicholas Vaidyanathan", email: "visionary.software.solutions@gmail.com" ] ]
}
