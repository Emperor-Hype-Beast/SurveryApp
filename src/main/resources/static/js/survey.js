document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('surveyForm');
    
    form.addEventListener('submit', async function(e) {
        e.preventDefault();
        
        // Clear previous validation states
        clearValidationStates();
        
        // Collect form data
        const formData = collectFormData();
        
        try {
            const response = await fetch('/api/survey', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(formData)
            });
            
            if (response.ok) {
                alert('Survey submitted successfully!');
                form.reset();
            } else {
                const errorData = await response.json();
                if (response.status === 400) {
                    displayValidationErrors(errorData);
                } else {
                    alert('Failed to submit survey. Please try again.');
                }
            }
        } catch (error) {
            console.error('Error submitting survey:', error);
            alert('An error occurred while submitting the survey. Please try again.');
        }
    });
    
    function collectFormData() {
        const formData = new FormData(form);
        
        // Collect food preferences
        const foods = {};
        const foodCheckboxes = document.querySelectorAll('input[name="foods"]:checked');
        
        // Initialize all food preferences to false
        foods.likesPizza = false;
        foods.likesPasta = false;
        foods.likesPapAndWors = false;
        foods.likesChicken = false;
        foods.likesBeef = false;
        foods.likesOther = false;
        
        // Set checked foods to true
        foodCheckboxes.forEach(checkbox => {
            switch(checkbox.value) {
                case 'pizza':
                    foods.likesPizza = true;
                    break;
                case 'pasta':
                    foods.likesPasta = true;
                    break;
                case 'papAndWors':
                    foods.likesPapAndWors = true;
                    break;
                case 'chicken':
                    foods.likesChicken = true;
                    break;
                case 'beef':
                    foods.likesBeef = true;
                    break;
                case 'other':
                    foods.likesOther = true;
                    break;
            }
        });
        
        return {
            surname: formData.get('surname'),
            firstName: formData.get('firstName'),
            contactNumber: formData.get('contactNumber'),
            age: parseInt(formData.get('age')),
            date: formData.get('date'),
            ...foods,
            eatOutRating: parseInt(formData.get('eatOutRating')),
            watchMoviesRating: parseInt(formData.get('watchMoviesRating')),
            watchTvRating: parseInt(formData.get('watchTvRating')),
            listenToRadioRating: parseInt(formData.get('listenToRadioRating'))
        };
    }
    
    function displayValidationErrors(errors) {
        Object.keys(errors).forEach(field => {
            const input = document.querySelector(`[name="${field}"]`);
            if (input) {
                input.classList.add('is-invalid');
                const feedback = input.parentNode.querySelector('.invalid-feedback');
                if (feedback) {
                    feedback.textContent = errors[field];
                }
            }
        });
    }
    
    function clearValidationStates() {
        const inputs = form.querySelectorAll('.form-control, .form-check-input');
        inputs.forEach(input => {
            input.classList.remove('is-invalid');
        });
        
        const feedbacks = form.querySelectorAll('.invalid-feedback');
        feedbacks.forEach(feedback => {
            feedback.textContent = '';
        });
    }
});