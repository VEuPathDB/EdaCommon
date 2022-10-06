# EdaCommon

Contains code, API and schema documents, and any other data needed by multiple EDA web services

See the [API Docs](https://veupathdb.github.io/EdaCommon/api.html).

## Overview

### Shared JSON Schema (RAML)

This repo contains (in schema/url) JSON schema elements (declared in RAML) that are shared across various
EDA services.  EdaSubsettingService produces metadata about the studies, entities, and variables available;
those JSON objects are deserialized by the merging, data, and compute services, using the Java classes
generated in this repo.  Meanwhile, the web client still has access to raw JSON schema information, which
client developers use to write typescript types around metadata responses.

In addition to the metadata schema elements, other schema elements shared across service repos include:

- subsetting filter specs
- variable and collection specs
- tabular request and response types

### Utility Classes (Java)

This repo contains a set of utility classes meant to ease communication between services.  These include:

- Client for dataset access service and utility to wrap and query response
- Request specs and validators for subsetting and merging service tabular endpoints
- Clients for subsetting and merging services
- Wrappers with convenience methods for managing EDA metadata, esp. entity trees

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
1. Go back to EdaCommon and run
    1. git pull (if you made any changes above in the github web UI)
    1. 'make release'
        1. This will create and publish project artifacts to github packages
1. Dependent EDA projects will need to be upgraded to the new version.  Open dependencies.gradle.kts in each of the following projects and change the version of EdaCommon to the new release:
    1. EdaSubsettingService
    1. EdaMergingService
    1. EdaDataService
    1. EdaUserService
    1. EdaComputeService
