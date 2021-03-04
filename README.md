# EdaCommon
Contains code, API and schema documents, and any other data needed by multiple EDA web services

## Release Procedure

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
        1. eda-common-1.0.0.pom
        1. eda-common-1.0.0.jar
        1. eda-common-1.0.0-javadoc.jar
        1. eda-common-1.0.0-sources.jar
    1. Click "Publish All" in the informational box
1. After some time, confirm the artifacts are available at:
    1. https://jcenter.bintray.com/org/veupathdb/service/eda/eda-common
