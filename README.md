# ContactFlo

Email Service API for Contact Me/Contact Us forms.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Setup](#setup)
- [Usage](#usage)
    - [Configuration](#configuration)
    - [Sending Emails](#sending-emails)

## Features

- **User Registration:** Register to receive a unique public key.
- **Secure Email Communication:** Receive emails securely using your public key.
- **Contact Form Integration:** Associate form submissions with user's public key.
- **Simplified Email Sending:** Easily send HTML emails with EmailService.
- **User-Friendly Setup:** Follow clear instructions for quick integration.

## Getting Started

### Prerequisites

- Java 8.
- Maven for building the project.
- Basic knowledge of Spring Boot.
- Sql Server

### Setup

1. Clone this repository to your local machine.
   git clone https://github.com/your-username/ContactFlo.git
   cd ContactFlo
2. Open the project in your preferred IDE
3. Configure your DB and email properties
   Open src/main/resources/application.yml and provide your email server and account details.
   
   Refer to this [link](https://www.tothenew.com/blog/step-by-step-guide-sending-emails-in-spring-boot/) for generating Spring mail password.
4. Build and run the project

### Usage


