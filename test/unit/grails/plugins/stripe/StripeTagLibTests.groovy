package grails.plugins.stripe



import grails.test.mixin.*
import org.junit.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
/**
 * See the API for {@link grails.test.mixin.web.GroovyPageUnitTestMixin} for usage instructions
 */
@TestFor(StripeTagLib)
class StripeTagLibTests {
    
    void testScriptWhenNoPublishableKeyProvided() {
        def result = shouldFail(GrailsTagException){
            applyTemplate("<stripe:script formName='dummy'/>")
        }
        assert result =~ "publishableKey must be provided! Please set it in your grails config"
    }
    
    void testScriptWhenNoFormNameProvided() {
        def result = shouldFail(GrailsTagException){
            grailsApplication.config.grails.plugins.stripe.publishableKey = "dummy"
            applyTemplate("<stripe:script />") 
        }
        assert result =~ "formName must be provided! Please pass it as an attribute"
    }
    
    void testValidScript(){
        grailsApplication.config.grails.plugins.stripe.publishableKey = "dummy"
        def result = applyTemplate("<stripe:script formName='funny' />")
        assert result =~ "(.*)dummy(.*)"
        assert result =~ "(.*)funny(.*)"
    }
    
    void testCreditCardInputsWithNoCssClass(){
        def result = shouldFail(GrailsTagException){
            applyTemplate("<stripe:creditCardInputs />")
        }
        assert result =~ "cssClass must be provided! Please pass it as an attribute"
    }
    
    void testValidCreditCardInputs(){
        def result = applyTemplate("<stripe:creditCardInputs cssClass='moose' />")
        assert result =~ /(.*)class="moose"(.*)/
    }
}
