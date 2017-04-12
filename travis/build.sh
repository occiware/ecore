
# Are we on the right branch?
if [ "$TRAVIS_BRANCH" = "master" ]; then
  
  # Is this not a build which was triggered by setting a new tag?
  if [ -z "$TRAVIS_TAG" ]; then

    cd clouddesigner/org.occiware.clouddesigner.parent
    mvn clean verify -Pbuild.products

  fi
fi

