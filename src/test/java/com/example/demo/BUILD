load("@com_googlesource_gerrit_bazlets//tools:junit.bzl", "junit_tests")

junit_tests(
    name = "test",
    srcs = glob(["**/*.java"]),
    deps = [
        "@maven//:com_google_code_gson_gson",
        "@maven//:org_junit_jupiter_junit_jupiter_api"
    ],
)
