<asset:javascript src="stripe-v2.js"/>

<asset:script>
    Stripe.setPublishableKey("${publishableKey}");
    
    if (window.location.protocol === 'file:') {
        alert("stripe.js does not work when included in pages served over file:// URLs.");
    }
</asset:script>