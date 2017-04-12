# Inspired from http://szagurskii.com/blog/how-to-deploy-apk-to-github-releases-with-travis-ci/

# Are we on the right branch?
if [ "$TRAVIS_BRANCH" = "master" ]; then
  
  # Is this not a Pull Request?
  if [ "$TRAVIS_PULL_REQUEST" = false ]; then
    
    # Is this not a build which was triggered by setting a new tag?
    if [ -z "$TRAVIS_TAG" ]; then
      echo "Starting to tag current release."

      git config --global user.email "travis@travis-ci.org"
      git config --global user.name "Travis CI"

      # Add tag and push to master.
      git tag -f current -m "Tagged from TravisCI for build $TRAVIS_BUILD_NUMBER"
      git push -f --tags https://${GIT_TOKEN}@github.com/occiware/ecore 1> /dev/null 2> /dev/null 

      echo "Done tag current release."
    fi
  fi
fi

