<r:script> 
    jQuery(document).ready(function() {
        jQuery("#${formName}").submit(function(event) {
            var $form = jQuery(this);

            // Disable the submit button to prevent repeated clicks
            $form.find('button').prop('disabled', true);
            
            Stripe.createToken($form, stripeResponseHandler);
            
            // Prevent the form from submitting with the default action
            return false;
        });
    });
</r:script>
