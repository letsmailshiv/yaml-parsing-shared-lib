
# Features

Below are the implemented and planned features to be developed as part of this shared library

## Implemented Features

## Features to be implemented

- [Release Tracker](release_tracker.md)
- [UCD pipeline/shared-lib](ucd_pipeline.md)

## Version 1

- Should be able to upload components to UCD
  - Integrated with CI build pipeline
  - Upload custom version from Nexus to UCD
- Should be able to deploy components to UCD
  - Integrated with CI build pipeline (env is fixed)
  - Deploy an existing version from Nexus / config file (custom env)
- Readme based documentation when developing code itself
- Configuration is managed in JSON/YAML format where appropriate

Refer to [workflow understanding](workflow.md) for step by step breakup used in development.

## Version 2

- Request the deployment of the component
  - Custom deployment tracker repository
  - Cater to parallel component deployments where applicable
- Should be able to create UCD snapshots
- Should be able to deploy UCD snapshots
