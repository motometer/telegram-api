#!/bin/bash
echo "Git branch $TRAVIS_BRANCH"

if [ $TRAVIS_BRANCH == "deploy" ]; then
    ./gradlew release -Prelease.useAutomaticVersion=true
    ./gradlew bintrayUpload
fi