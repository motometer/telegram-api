if [ $TRAVIS_BRANCH == "master" ]; then
    ./gradlew release -Prelease.useAutomaticVersion=true
    ./gradlew bintrayUpload
fi