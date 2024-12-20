# JacocoAGPTestApp

Run `jacocoTestReport` task to generate JaCoCo coverage.

See `register-fragment` branch for base setup conditions, `register-fragment-agp-8-8` branch for the bug, and `not-register-fragment-agp-8-8` for some additional context into the bug.

There are 2 unit tests (1 junit, 1 instrumentation) in the project, which offers code coverage for the `RegisterFragment` class and it's 2 methods (one tested per each test type).

Current issues:
1. Starting with AGP 8.8.0-alpha09, JaCoCo coverage from instrumented tests for the `RegisterFragment` class is missing.  JaCoCo version and all other dependencies remain constant between the base setup branch and the bug branch, only AGP/Gradle wrapper version change.  on AGP 8.8.0-alpha09, I do see coverage working when the file is named something different - i.e. `SignInFragment`, so I suspect something is specifically blocking the coverage data based on the file name.  (See https://issuetracker.google.com/issues/380291901)
