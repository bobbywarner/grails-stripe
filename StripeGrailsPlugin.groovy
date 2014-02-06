/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
class StripeGrailsPlugin {
    def version = "2.6"
    def grailsVersion = "1.3.7 > *"
    def loadAfter = ['resources', 'jquery']

    def title = "Stripe"
    def description = "Plugin for using Stripe to process credit card transactions."
    def documentation = "http://bobbywarner.github.com/grails-stripe"
    def license = "APACHE"
    def issueManagement = [ system: "GitHub", url: "https://github.com/bobbywarner/grails-stripe/issues" ]
    def scm = [ url: "https://github.com/bobbywarner/grails-stripe" ]
    def developers = [
        [ name: "Bobby Warner", email: "bobbywarner@gmail.com" ],
        [ name: "Nicholas Vaidyanathan", email: "visionary.software.solutions@gmail.com" ]
    ]

    def doWithApplicationContext = {
        com.stripe.Stripe.apiKey = application.config.grails.plugins.stripe.secretKey

        if (application.config.grails.plugins.stripe.containsKey('api')) {
            com.stripe.Stripe.overrideApiBase(application.config.grails.plugins.stripe.api.url)
        }

    }
}
