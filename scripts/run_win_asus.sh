#!/usr/bin/env bash

"/mnt/c/Users/asus/.jdks/openjdk-21.0.2/bin/java.exe" -javaagent:libs/idea_rt.jar=49830:libs/bin \
    -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 \
    -classpath out/production/SonOfThoy Main
