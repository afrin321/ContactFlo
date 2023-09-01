console.log('hello')

var emailInput = document.getElementById("email-id-for-key");

    function focusOnEmail() {
        event.preventDefault();
        emailInput.focus();
    }

    function submitEmail() {
        event.preventDefault();
        document.getElementById("key-gen-response").innerHTML = "Please Wait...";
        console.log("Loading...");

        generateKey();

    }

    async function generateKey() {
        console.log("Sending request");

        var email = emailInput.value;

        const response = await fetch("http://localhost:8081/api/keygen/newkey", {
                                method: "POST",
                                headers: {
                                      "Content-Type": "application/json",
                                      // 'Content-Type': 'application/x-www-form-urlencoded',
                                },
                                body: JSON.stringify({
                                    "email": email,
                                }),
                            })
                            .then(response => response.text())
                            .then(data => {
                                console.log(data)
                                    document.getElementById("key-gen-response").innerHTML = data + "!";
                            })
                            .catch(error => {
                                document.getElementById("key-gen-response").innerHTML = "Encountered an error. Please try again later.";
                                console.error("Error fetching data:", error);
                            });
    }






console.log('end')