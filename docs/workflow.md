# Understanding of workflow

## Version 1

## Should be able to upload components to UCD

1. Connect to UCD / failure in connectivity
2. Artefact should be available for upload
3. Component should available in UCD for the artefact
4. Automated naming for the component version using combination of artefact name + commit hash + build id
5. Upload the artefact to UCD
   - Part of CI with version name generated
   - Should be able to be used for an ad-hoc job with version provided in configuration
6. Success / failure of the upload step should be passed back

## Should be able to deploy components to UCD

1. Connect to UCD / failure in connectivity
2. Component version to be deployed is already uploaded to UCD
3. Component process to be called is already configured
4. Environment is specified for the deployment
5. Create JSON request for the deployment
6. Request the deployment of the component
7. Keep polling UCD till the deployment request is completed to get the state of deployment
8. Success / failure of the deployment step should be passed back
