package com.dockerProj.SimpleAppForPrac.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return """
                <html>
                <body style='font-family: Arial, sans-serif; text-align: center;'>
                    <h2>Deployed My First Spring Boot Application on AWS EC2!</h2>
                    <img src='/images/girishSample.jpg' alt='Girish Photo' width='200' style='border-radius: 50%; margin: 10px;' />
                    <p>Hello! I’m Girish — currently learning DevOps. This is my first Java application successfully deployed on an AWS EC2 instance. 🚀</p>
                    <p>I’m excited to share my progress and connect with others who are also learning DevOps. Let’s grow and learn together!</p>
                    <p>
                        👉 <a href='https://www.linkedin.com/in/girish-pote-608a40193/' target='_blank'>
                        Visit my LinkedIn Profile</a>
                    </p>
                </body>
            </html>
            """;
	}
}
