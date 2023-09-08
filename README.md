# JacocoAGPTestApp

Run `jacocoTestReport` task to generate JaCoCo coverage.

There are 2 unit tests (1 junit, 1 instruementation) in the project, which offers code coverage for the `TestClass` class and it's 2 methods (one tested per each test type).

Current issues:
1. On AGP 8.2.0 (so far tested all versions up to beta02), JaCoCo version configuration does not work.  Despite specifying version `0.8.10` in the build.gradle file, `0.8.8` is used when the `jacocoTestReport` task is run (version info is listed in the bottom right of the HTML file).   Version `0.8.10` is reported when running this on `master` branch.  Check out `agp-8-2-0` branch for working example of this issue. (See https://issuetracker.google.com/issues/298703884)
