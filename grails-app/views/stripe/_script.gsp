<r:require module="stripe"/>

<r:script disposition='head'>
    Stripe.setPublishableKey("${publishableKey}");
    
    if (window.location.protocol === 'file:') {
        alert("stripe.js does not work when included in pages served over file:// URLs.");
    }
</r:script>