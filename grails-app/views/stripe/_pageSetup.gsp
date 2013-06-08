<r:script> 
    jQuery(function($) {
        $("#${formName}").submit(function(event) {
            var $form = $(this);

            // Disable the submit button to prevent repeated clicks
            $form.find('button').prop('disabled', true);
            
            Stripe.createToken($form, stripeResponseHandler);
            
            // Prevent the form from submitting with the default action
            return false;
        });
    });
</r:script>
