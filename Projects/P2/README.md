# Project 2: PacMan CI

Due: 01/18, 11:59pm EDT (Late 01/19 11:59pm)

## Before You Start

Make sure you have completed both P1 and P0 before you start this project.

**It is important you do not start the following steps before Wednesday**. There will be a lecture on Wednesday on GitHub Actions which is the first part of the project. On Wednesday, your project managers will also make your repos public so that your team can complete Part 3 of the project. If you start this project before we make your repositories public, you will most likely deplete this organization's minutes

**This project will require collaborating among 8 people**. This project is being released on Monday to give teams time to schedule when they need to complete their tasks by. Some key steps to take before Wednesday:

- Create cards for Part 1, 2, and 3 and assign deadlines. 
  - Add these deadlines on your cards on your Kanban Board to make thenm visible to the entire team 
  - Features needs to be merged to main by your PM - make sure they also know when your deadline is.
- Reach out to the other team and communicate on when both teams will have Part 2 completed by
  - Create a channel on slack with both teams to open a channel of communication. 
  - Each team will need to complete Part 2 before the other team can fork their repository. The deadlines on your cards will help communicate this

## Introduction

**READ THE BEFORE YOU START SECTION BEFORE CONTINUING** 

In this project, you will adding Continous Integration pipelines to your PacMan project. This project has three parts:

- GitHub Actions - FTR-actions
- Sabotage - FTR-sabotage
- Good Samaritan - FTR-fix

The instructions below call for branching a feature-item for each member rather than for each function. Since there isn't much code development in this project, and some parts of the project may feel repetitive, this may be an easier format for branching. However, if you would like to create a feature-item for each function as we did in P1, you are free to use that format as well. Make sure the entire team chooses only one of these two strategies for consistency.


## Part 1: GitHub Actions

Only one person from each team needs to take the following steps:

1. Create a feature-item actions-setup for the main.yaml file 
2. Add a main.yml file to your feature-item that uses the openjdk image and compiles all of your files
3. Create a pull request, add a reviewer, and have the reviewer merge the feature-item to FTR-actions

Once the steps above have been completed, you should be able to see a workflow show up on the Actions tab on GitHub. Now that the project is configured to work with GitHub Actions, each team member should

6. Create a feature-item branch actions-name_of_member
7. Modify the main.yml file to include a job for each test that you wrote
8. Create a pull request, add a reviewer, and have the reviewer merge your feature-item to FTR-actions

Once all feature-items have been completed

9. Submit a pull request to merge FTR-actions with the main branch
10. Add your TA as a reviewer
11. Once the merge is complete, you should be able to see all of your jobs passing on the Actions tab

**Note** Your tests must run be able to run headless (i.e. without a Java Display). Make sure to include the ```-Djava.awt.headless=true``` flag when running tests both locally and on Actions. You should also use the **NoFrame** class instead of the MainFrame class to avoid a ```java.awt.HeadlessException```. It has the same functionality as MainFrame but it doesn't create a JFrame for the display.

## Part 2: Sabotage

<p align="center">
<img src="https://i.redd.it/n0cz029px3q51.jpg"/>
</p>

1. Checkout a new branch from the FTR-sabotage feature branch that is titled with sabotage-your_name
2. Change your function so that it will fail the test you wrote previously
3. Create a pull request, add a reviewer, and have the reviewer merge your feature-item to FTR-sabotage
 
**Any 'mistakes' that you have intentionally made MUST be reversible**

Once the steps above have been completed, your team should

4. Submit a pull request to merge FTR-sabotage with the main branch
5. Add your TA as a reviewer
6. Once the merge is complete, check that all of your tests are now failing on the Actions tab

## Part 3: Good Samaritan

<p align="center">
<img src="https://wallpapercave.com/wp/wp7559354.png"/>
</p>

Now its time to fix these sabotages!

You and your team will be assigned a sabotaged repository of another team. You must fork the repository, identify the mistakes and fix the code.

Only one person from each team needs

1. Fork the assigned Repository
2. Create a Feature branch titled FTR-Fix
3. Give your team access to collaborate on the repository (including your PM!)

Once the repository has been forked, the team should

4. Analyze the tests failing the issues 
5. Divide and conquer the necessary fixes (you may want to fix the same functions you sabotaged in Part 1 and wrote for Project 1)

Each member should

6. Create a branch that is titled fix-your_name and fix the issues
7. Commit and Push Changes to the original repository
8. Submit a pull request to merge your branch with the FTR-fix branch on the forked repo

Once all members have made their changes,

9. Submit a pull request to merge FTR-Fix with the main branch
10. Open a Pull Request to merge the forked repository with the original repository

Once all steps are complete, you should be able to see that the other team's workflow has all of its tests passing again. Finally the other team should

11. Review the Pull Request and merge the forked repository with the original repository

## Academic Integrity

Please **carefully read** the academic honesty section of the course syllabus. **Any evidence** of impermissible cooperation on projects, use of disallowed materials or resources, or unauthorized use of computer accounts, **will be** submitted to the Student Honor Council, which could result in an XF for the course, or suspension or expulsion from the University. Be sure you understand what you are and what you are not permitted to do in regards to academic integrity when it comes to project assignments. These policies apply to all students, and the Student Honor Council does not consider lack of knowledge of the policies to be a defense for violating them. Full information is found in the course syllabus, which you should review before starting.
