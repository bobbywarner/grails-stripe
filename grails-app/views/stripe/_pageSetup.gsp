<r:script> 
  jQuery(document).ready(function() {
        jQuery("#${formName}").submit(function(event) {
            // disable the submit button to prevent repeated clicks
            jQuery('.submit-button').attr("disabled", "disabled");
            // createToken returns immediately - the supplied callback submits the form if there are no errors
            Stripe.createToken({
                number: jQuery('.card-number').val(),
                cvc: jQuery('.card-cvc').val(),
                exp_month: jQuery('.card-expiry-month').val(),
                exp_year: jQuery('.card-expiry-year').val()
            }, stripeResponseHandler);
            return false; // submit from callback
        });
    });
</r:script>