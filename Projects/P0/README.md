# Project 0
Due: 01/03, 11:59pm EDT (Late TBD)

## Join The Slack

We will be using Slack to coordinate communication among teams in this class. 
Join the slack with [this link](https://join.slack.com/t/cmsc388twinter21/shared_invite/zt-kfiov4no-LE0XGV~f2PC3LUXrXjwAgA).

## Team Formation

Sign up for a team on [this google sheets](https://docs.google.com/spreadsheets/d/1EyXXoQeFh38qOz_gT1qM9iAlUIOX2chKbmEub57pHT4/edit?usp=sharing). 
Add your full name, github username, and directory ID.
Your assigned project manager will add you to your team's slack channel and invite you to collaborate on your team's repo.

## Set Up Your Local Git Environment

Take the following steps to set up your Local Git Environment

1. Generate your ssh-keys with ```ssh-keygen```
2. Configure your local environment with your name and email
      - ```git config --global user.name "your_name_here"```
      - ```git config --global user.email your_email_here```
3. Add your ssh-keys to your GitHub account 
4. Clone your repository using ssh ```git clone git@...```

Once you have cloned the remote repository, checkout the setup branch

```bash
git checkout setup
git pull
```

edit the main README and add your name as one of the lines. Then add, commit, and push your changes:

```bash
git add README.md
git commit -m "your_name git setup"
git push -u origin setup
```

## Checking Your Java Installation

Once you have cloned the repository, test your Java installation:

```bash
cd path_to_repo/Projects/P0
javac HelloWorld.java
java HelloWorld
```

We will also be using JUnit Tests in this class. Run the following commands to test that you can run and compile JUnit tests:

```bash
cd path_to_repo/Projects/P0
javac -cp "junit-4.10.jar:." TestHelloWorld.java 
java -cp "junit-4.10.jar:." org.junit.runner.JUnitCore TestHelloWorld
```

## Academic Integrity

Please **carefully read** the academic honesty section of the course syllabus. **Any evidence** of impermissible cooperation on projects, use of disallowed materials or resources, or unauthorized use of computer accounts, **will be** submitted to the Student Honor Council, which could result in an XF for the course, or suspension or expulsion from the University. Be sure you understand what you are and what you are not permitted to do in regards to academic integrity when it comes to project assignments. These policies apply to all students, and the Student Honor Council does not consider lack of knowledge of the policies to be a defense for violating them. Full information is found in the course syllabus, which you should review before starting.
