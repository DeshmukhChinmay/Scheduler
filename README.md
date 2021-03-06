# 306Project1
Project 1 for SOFTENG 306. Team 8.
This project is about using AI and parallel processing power to solve difficult scheduling problems.

## Installation
Using maven, build the project by the 'install' goal with the pom.xml file.

To build the jar:

  -With intellij:Project structure -> Artifacts -> + -> JAR from modules with dependencies -> Choose main class 'Main' -> OK

## Command Line Interface
````+
java −jar scheduler.jar INPUT.dot P [OPTION]
INPUT.dot   A task main.graph with integer weights in dot format
P           Number of processors to schedule the INPUT main.graph on

Optional:
−p N        Use N cores for execution in parallel (default is sequential)
−v          Visualise the search
−o OUTPUT   Output file is named OUTPUT (default is INPUT−output.dot)
````

## Team Members (name, upi, ID, GitHub username)
- Chinmay Deshmukh - cdes685 - 601728736 - (DeshmukhChinmay)
- Aditya Krishnan - akri095 - 270880521 - (Akrya)
- Terence Qu - tqu593 - 962508341 - (Terenco12345)
- Shunji Takano - stak469 - 492810641 - (stak469)
- Kungeng Wu - kwu849 - 948234882 - (kwu849)



## Plan
Plan for the Project includes a Gantt Chart, Network Depenency Graph and a Work Breakdown Structure
The files can be found in the folder ProjectManagementPlans in the resources folder

## Other Information 
Details on the meetings, decisions and background research can be found in the Github Wiki
