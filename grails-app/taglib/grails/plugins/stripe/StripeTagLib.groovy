/* Copyright 2012 the original author or authors.
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
package grails.plugins.stripe

import com.stripe.Stripe

class StripeTagLib {
    static namespace = 'stripe'
    
    /**
     * Creates the JavaScript required to process the credit card form.
     *
     * @attr formName REQUIRED the field formName
     */
    def script = { attrs, body ->
        Stripe.apiKey = grailsApplication.config.grails.plugins.stripe.secretKey
        def publishableKey = grailsApplication.config.grails.plugins.stripe.publishableKey
        
        out << render(template: "/stripe/script", model: [publishableKey: publishableKey, formName: attrs.formName], plugin: 'stripe')
    }
}
