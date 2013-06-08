<div class="${cssClass}">
    <label>Card Number</label>
    <input type="text" size="20" autocomplete="off" data-stripe="number"/>
</div>
<div class="${cssClass}">
    <label>CVC</label>
    <input type="text" size="4" autocomplete="off" data-stripe="cvc"/>
</div>
<div class="${cssClass}">
    <label>Expiration (MM/YYYY)</label>
    <input type="text" size="2" data-stripe="exp-month"/>
    <span> / </span>
    <input type="text" size="4" data-stripe="exp-year"/>
</div>
