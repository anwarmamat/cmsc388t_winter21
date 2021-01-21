# Project 3: Personal Website
Due: Sunday 01/24, 11:59pm EDT (Late 01/25)

## Before You Start

The Deployment Lecture, Docker Lecture, and TerpConnect and GitHub Pages reading notes will help you complete this project. Make sure you refer to those resources when completing this project.

This is an individual project. You are **not** allowed to collaborate with other students on this project.

## Introduction

In this project, you will be creating a personal website that you will be hosting on TerpConnect. There are three sections for this project:

1. Hosting Website On Github Pages
2. Dockerizing Your WebApp
3. Deploying Website To TerpConnect

These three parts are more or less independent of one another and present three different ways to host your website. 

### Submitting

You will be adding links for your Github Pages Site and TerpConnect site to your website repository's README. You will also need to make your project manager a collaborator on your repo to allow them to test the actions you will be writing in Part 3.

## Part 1
In this part you will be forking our template repository and editing the provided HTML locally on your own computer. You must complete the basic **required** edits in the index.html file (these are specified within this file as well):

- Name
- Profile Picture
- Introduction
- Relevant Info
- Interests
- GitHub Profile

To get full credit, also make at least one change to the website to personalize it. For example, you could

- Add a header image
- Change the style/colors
- Add another social media link
- Add another section

Feel free to add your own touch to the HTML and/or CSS files. Once you've committed your changes, push your repository to remote. Describe what custom change you made on your website repository's README underneath your GitHub Pages Site link. 

## Part 2
In this part you will be using Docker to dockerize your web app and run it in the background locally. To do this, you should edit the provided dockerfile and docker-compose.yml templates. The procedure detailed in the Docker Lecture should help you create a simple docker image for your website. 

**Important Notes**

- The backend is written in Node.js You should use the "node-10:alpine" image in your dockerfile. This image also comes preconfigured with a "node" user which you can use rather than creating a custom user
- The package.json file includes a list of all dependencies. You will need to copy this and run ```npm install``` when building your image.
- Before you run any commands in your dockerfile (CMD), make sure to ```EXPOSE 8080```. This will expose the port and allow incoming and outgoing traffic flows from your docker container.
- To run a node app, the bash syntax is ```node app.js```
- To test your docker configuration, you can run
```
docker build -t node-web-app .
docker run --name "website" -p 80:8080 -d node-web-app 
Go to localhost:80/
```
- To test your docker-compose configuration, you can run
```
docker-compose up -d --force-recreate
Go to localhost:80/
```
- To remove all containers, you can run
```
docker system prune -af
```


## Part 3
In this part you will be deploying your website to TerpConnect using GitHub Actions. As shown in the Deployment Lecture, you need to create **three** workflows:

- Clone Workflow to clone your repository in the correct location on TerpConnect on workflow_dispatch
- Update Worfklow to pull changes to your repository on TerpConnect when changes are pushed to main
- Delete Workflow to delete your repository from TerpConnect on workflow_dispatch

Your website should be avaialble at https://terpconnect.umd.edu/~directory_id/repo_name/ after clone and update automatically when you push to main. After delete, the website should no longer exist. 

Just to clarify, TerpConnect can only serve static content. You should not be running your docker containers on TerpConnect.

## Academic Integrity

Please **carefully read** the academic honesty section of the course syllabus. **Any evidence** of impermissible cooperation on projects, use of disallowed materials or resources, or unauthorized use of computer accounts, **will be** submitted to the Student Honor Council, which could result in an XF for the course, or suspension or expulsion from the University. Be sure you understand what you are and what you are not permitted to do in regards to academic integrity when it comes to project assignments. These policies apply to all students, and the Student Honor Council does not consider lack of knowledge of the policies to be a defense for violating them. Full information is found in the course syllabus, which you should review before starting.
