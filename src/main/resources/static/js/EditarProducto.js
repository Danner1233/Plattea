document.addEventListener('DOMContentLoaded', function() {
    const productQuantityInput = document.getElementById('product-quantity');
    const updateButton = document.querySelector('.update-button');

    updateButton.addEventListener('click', function() {
        alert(`Cantidad actualizada a: ${productQuantityInput.value}`);
    });
});
