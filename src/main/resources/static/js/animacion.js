document.addEventListener('DOMContentLoaded', () => {
    const buttons = document.querySelectorAll('.brand-button');
    const indicator = document.querySelector('.indicator');
    const carItems = document.querySelectorAll('.car-item');

    buttons.forEach(button => {
        button.addEventListener('click', () => {
            // Remove selected class from all buttons
            buttons.forEach(btn => btn.classList.remove('selected'));
            // Add selected class to the clicked button
            button.classList.add('selected');
            // Move the indicator to the clicked button
            const rect = button.getBoundingClientRect();
            const containerRect = button.parentElement.getBoundingClientRect();
            indicator.style.left = `${rect.left - containerRect.left + rect.width / 2 - indicator.offsetWidth / 2}px`;

            // Filter car items based on the selected brand
            const selectedBrand = button.getAttribute('data-brand');
            carItems.forEach(car => {
                if (car.getAttribute('data-brand') === selectedBrand) {
                    car.style.display = 'block';
                } else {
                    car.style.display = 'none';
                }
            });
        });
    });

    // Initialize the indicator position
    const selectedButton = document.querySelector('.brand-button.selected');
    if (selectedButton) {
        const rect = selectedButton.getBoundingClientRect();
        const containerRect = selectedButton.parentElement.getBoundingClientRect();
        indicator.style.left = `${rect.left - containerRect.left + rect.width / 2 - indicator.offsetWidth / 2}px`;
    }
});
