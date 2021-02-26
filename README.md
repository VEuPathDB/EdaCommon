# EdaCommon
Contains code, API and schema documents, and any other data needed by multiple EDA web services

# Release Procedure

1. Commit and push all changes that should be added to the release
1. Update the project version in build.gradle.kts to the desired version number
    1. e.g. version = "1.0.0" (will use 1.0.0 as our target version for these instructions)
    1. Semantic versioning preferred
1. Commit and push the version change
1. Create and push new tag (note the 'v')
    1. \> git tag v1.0.0; git push --tags
1. Visit https://github.com/VEuPathDB/EdaCommon/tags and create a Release
    1. Title can be set to the name of the tag
    1. Add description as desired (covering highlights of release)
1. Visit https://bintray.com/beta/#/veupathdb/maven/eda-common and add a Version
    1. Name should be 1.0.0 (without the 'v')
    1. Choose today's date
1. In EdaCommon, run: \> make release
1. Go back to https://bintray.com/beta/#/veupathdb/maven/eda-common
    1. Choose (top right) Actions -> Upload Files
    1. Select the new version
    1. Leave Target Path empty (will be auto-filled later)
    1. Select the four files in EdaCommon/build/libs and click 'Upload'
        1. eda-common-1.1.0.pom
        1. eda-common-1.1.0.jar
        1. eda-common-1.1.0-javadoc.jar
        1. eda-common-1.1.0-sources.jar
    1. Click "Publish All" in the informational box
1. After some time, confirm the artifacts are available at:
    1. https://jcenter.bintray.com/org/veupathdb/service/eda/eda-common

# docker-compose

## preliminary requirements

To bring up the eda project via docker-compose, you'll need a few things.

* a functioning docker setup, and docker-compose (TODO: links to installs)
* a functioning traefik setup.  clone the https://github.com/VEuPathDB/docker-traefik project, and run `docker-compose up -d` in the clone, or follow the instructions in that repo.  This will run traefik locally, which handles the container routing
* a functioning sshuttle setup.  If you need to access databases on internal networks, you'll need to properly setup sshuttle so that your containers can reach them.  Setting this up is out of scope for this document, to not expose unnecessary internal details publicly.

## bring up the eda project

* clone this repo, and add any required environment variables to your `.env` file. (TODO: explain what those variables do)
* `docker-compose up` in your clone of this repo.


When everything comes up successfully, you'll be able to reach services at:

https://edasubsetting-dev.local.apidb.org:8443/
https://edadata-dev.local.apidb.org:8443/

# notes

* all services use https, but the certs are not valid.  You will need to accept them in a browser, or use the `-k` flag with curl


