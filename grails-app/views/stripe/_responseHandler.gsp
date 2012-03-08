<r:script>
  function stripeResponseHandler(status, response) {
        if (response.error) {
            // re-enable the submit button
            jQuery('.submit-button').removeAttr("disabled");
            // show the errors on the form
            jQuery(".payment-errors").html(response.error.message);
        } else {
            var form$ = jQuery("#${formName}");
            // token contains id, last4, and card type
            var token = response['id'];
            // insert the token into the form so it gets submitted to the server
            form$.append("<input type='hidden' name='stripeToken' value='" + token + "' />");
            // and submit
            form$.get(0).submit();
        }
    }
</r:script>