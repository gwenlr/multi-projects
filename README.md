# multi-projects
Simple "multi-projects" template in Gradle and Kotlin.

The simplified structure is: 
```text
./multi-projects/
   |-- my-app/              # Base project
   |   |-- app/             # Sub-project, a simple CLI
   |   |-- my-plugin/       # Base project, a simple Gradle plugin 
   |   \-- rest-app/        # Sub-project, a simple REST webapp
   \-- my-utils/            # Base project
       |-- number-utils/    # Sub-project
       \-- string-utils/    # Sub-project
```

The detailed structure is: 
```text
./multi-projects/
   |-- my-app/
   |   |-- gradle.gradle.kts
   |   |-- settings.gradle.kts
   |   |-- app/
   |   |   |-- src/
   |   |   \-- build.gradle.kts
   |   |-- my-plugin/
   |   |   |-- src/
   |   |   |-- build.gradle.kts
   |   |   \-- settings.gradle.kts
   |   \-- rest-app/
   |       |-- src/
   |       \-- build.gradle.kts
   \-- my-utils/
       |-- gradle.gradle.kts
       |-- settings.gradle.kts
       |-- number-utils/
       |   |-- src/
       |   \-- build.gradle.kts
       \-- string-utils/
           |-- src/
           \-- build.gradle.kts
```
