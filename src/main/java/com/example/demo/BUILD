load("@rules_java//java:defs.bzl", "java_binary", "java_library")

java_library(
    name="java-maven-lib",
    srcs = glob(["**/*.java"]),
    deps = [
        "@maven//:com_google_code_gson_gson",
    ]
)

java_binary(
    name = "app",
    main_class = "com.example.demo.App",
    runtime_deps=[":java-maven-lib"]
)
