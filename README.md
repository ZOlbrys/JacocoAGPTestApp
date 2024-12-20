# JacocoAGPTestApp

Run `jacocoTestReport` task to generate JaCoCo coverage.

See `register-fragment` branch for base setup conditions, and `register-fragment-agp-8-8` for the bug.

There are 2 unit tests (1 junit, 1 instrumentation) in the project, which offers code coverage for the `RegisterFragment` class and it's 2 methods (one tested per each test type).

Current issues:
1. Starting with AGP 8.8.0-alpha09, JaCoCo coverage from instrumented tests for the `RegisterFragment` class is missing.  JaCoCo version and all other dependencies remain constant between the base setup branch and the bug branch, only AGP/Gradle wrapper version change.  (See https://issuetracker.google.com/issues/380291901)
