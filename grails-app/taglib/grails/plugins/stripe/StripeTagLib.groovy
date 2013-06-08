/*
 * Copyright 2012 the original author or authors.
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
        def publishableKey = grailsApplication.config.grails.plugins.stripe.publishableKey
        if(!publishableKey){
            throw new IllegalArgumentException("publishableKey must be provided! Please set it in your grails config")
        }
        out << render(template: "/stripe/script", model: [ publishableKey: publishableKey ], plugin: 'stripe')
        setupPage(attrs.formName)
    }
    
    private void setupPage(String formName){
        if(!formName){
            throw new IllegalArgumentException("formName must be provided! Please pass it as an attribute")
        }
        else{
            emitResponseHandler(formName)
            emitPageSetup(formName)
        }
    }
    
    private void emitResponseHandler(String formName){
        out << render(template: "/stripe/responseHandler", model: [formName: formName], plugin: 'stripe')
    }
    
    private void emitPageSetup(String formName){
        out << render(template: "/stripe/pageSetup", model: [formName: formName], plugin: 'stripe')
    }
    
    /**
     * Creates the form to input credit card details.
     *
     * @attr cssClass REQUIRED the field cssClass
     */
    def creditCardInputs = { attrs, body ->
        def cssClass = attrs.cssClass
        if(!cssClass){
            throw new IllegalArgumentException("cssClass must be provided! Please pass it as an attribute")
        }
        out << render(template: "/stripe/creditCardInputs", model: [cssClass: cssClass], plugin: 'stripe')
    }
}
