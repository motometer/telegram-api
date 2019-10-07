if [ $TRAVIS_BRANCH == "deploy" ]; then
    ./gradlew release -Prelease.useAutomaticVersion=true
    ./gradlew bintrayUpload
fi