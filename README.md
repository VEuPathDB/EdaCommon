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
1. Go back to EdaCommon and run 'make release'
    1. This will create and publish project artifacts to github packages
