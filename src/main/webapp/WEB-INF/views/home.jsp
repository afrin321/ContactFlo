<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ContactFlo - Backend Support for Contact Forms</title>
    <link rel="stylesheet" href="/css/styles.css">

</head>
<body>
    <div class="container">
        <header class="header">
            <h1 class="header-title">Welcome to ContactFlo</h1>
            <p class="header-subtitle">Your Solution for Backend Support</p>
            <p class="header-description">Receive HTML contact form submissions directly in your email inbox using our Contact Form API service without any server or backend code. And the best part? It's completely free!</p>
            <a href="#create-access-key-section" class="button" data-target="email-id-for-key" onClick="focusOnEmail()">Get Started</a>
        </header>



        <section class="technology-section">
            <h2 class="section-title">Easily Integrate with Any Technology</h2>
            <div class="tech-list">
                <img class="tech-list-item" src="https://icon-library.com/images/html5-icon/html5-icon-13.jpg" alt="HTML5">
                <img class="tech-list-item" src="https://cdn4.iconfinder.com/data/icons/social-media-logos-6/512/121-css3-512.png" alt="CSS3">
                <img class="tech-list-item" src="https://cdn2.iconfinder.com/data/icons/designer-skills/128/code-programming-javascript-software-develop-command-language-512.png" alt="JavaScript">
                <img class="tech-list-item" src="https://cdn4.iconfinder.com/data/icons/logos-3/600/React.js_logo-512.png" alt="React">
                <img class="tech-list-item" src="https://cdn2.iconfinder.com/data/icons/designer-skills/128/angular-512.png" alt="Angular">
                <img class="tech-list-item" src="https://upload.wikimedia.org/wikipedia/commons/9/95/Vue.js_Logo_2.svg" alt="Vue.js">
                <img class="tech-list-item" src="https://cdn.sanity.io/images/3do82whm/next/4b1f008289a88f4438a1c983fb32cf1a636d9d0e-1000x667.png?w=720&h=480&fit=clip&auto=format" alt="Next.js">
                <img class="tech-list-item" src="https://kinsta.com/wp-content/uploads/2022/05/nuxt-js-logo.jpeg" alt="Nuxt.js">
                <img class="tech-list-item" src="https://upload.wikimedia.org/wikipedia/commons/1/1b/Svelte_Logo.svg" alt="Svelte.js">
                <img class="tech-list-item" src="https://avatars.githubusercontent.com/u/70142?s=200&v=4" alt="JQuery">
            </div>
        </section>
        <div class="steps-container">
        <section class="create-access-key-section" id="create-access-key-section">
                    <h2 class="section-title"> Step 1: Create Access Key</h2>
                    <p>An access key will be sent to your email address.</p>
                    <form class="access-key-form" onSubmit="submitEmail()">
                        <input type="email" id="email-id-for-key" placeholder="Enter your email" class="access-key-input" required>
                        <button type="submit" class="button">Create Access Key</button>
                    </form>
                    <p id="key-gen-response" class="key-gen-response"></p>
        </section>

        <section class="create-access-key-section">
                    <h2 class="section-title"> Step 2: Add Access Key to Form</h2>
                    <div class="code-editor">
                        <pre class="contact-form-html">
&lt;form action="http://localhost:8081/api/keygen/newkey" method="POST"&gt;
    &lt;!-- Add ACCESS_KEY to your form --&gt
    &lt;input type="hidden" name="apiKey" value="YOUR_ACCESS_KEY_HERE" --&gt;
    &lt;input type="text" name="name" required&gt;
    &lt;input type="email" name="email" required&gt;
    &lt;textarea name="message" required&gt;&lt;/textarea&gt;
    &lt;button type="submit"&gt;Submit Form&lt;/button&gt;
&lt;/form&gt;
                        </pre>
                    </div>
        </section>
        <section class="create-access-key-section" id="create-access-key-section">
                   Explore Templates. (Coming soon!)
        </section>
        </div>
    </div>




    <script src="/js/index.js"></script>
</body>
</html>
